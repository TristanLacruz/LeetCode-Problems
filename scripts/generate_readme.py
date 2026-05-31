import os

DIFFICULTIES = ["Easy", "Medium", "Hard"]
EMOJI = {"Easy": "🟢", "Medium": "🟡", "Hard": "🔴"}
LEETCODE_BASE = "https://leetcode.com/problems"

def parse_filename(filename):
    # "26-Remove_Duplicate_from_Sorted_Array.java" → (26, "Remove Duplicate from Sorted Array")
    name = filename.replace(".java", "")
    parts = name.split("-", 1)
    number = parts[0]
    title = parts[1].replace("_", " ") if len(parts) > 1 else name
    slug = parts[1].replace("_", "-").lower() if len(parts) > 1 else ""
    url = f"{LEETCODE_BASE}/{slug}/" if slug else "#"
    return number, title, url

def generate_difficulty_readme(folder):
    files = sorted(
        [f for f in os.listdir(folder) if f.endswith(".java")],
        key=lambda x: int(x.replace("_", "-").split("-")[0]) # Orders by problem number
    )
    emoji = EMOJI[folder]

    lines = [
        f"# {emoji} {folder} Problems\n\n",
        "| # | Problem | Solution |\n",
        "|---|---------|----------|\n",
    ]

    for f in files:
        number, title, url = parse_filename(f)
        lines.append(f"| {number} | [{title}]({url}) | [Java](./{f}) |\n")

    with open(f"{folder}/README.md", "w", encoding="utf-8") as readme:
        readme.writelines(lines)

    return len(files)

def generate_root_readme(counts):
    total = sum(counts.values())
    lines = [
        "# 🧩 LeetCode Solutions\n\n",
        "Daily solutions in Java.\n\n",
        "## 📊 Progress\n\n",
        "| Difficulty | Solved |\n",
        "|------------|--------|\n",
        f"| 🟢 Easy    | {counts['Easy']} |\n",
        f"| 🟡 Medium  | {counts['Medium']} |\n",
        f"| 🔴 Hard    | {counts['Hard']} |\n",
        f"\n**Total: {total} problems solved**\n",
    ]
    with open("README.md", "w", encoding="utf-8") as readme:
        readme.writelines(lines)

counts = {}
for diff in DIFFICULTIES:
    if os.path.exists(diff):
        counts[diff] = generate_difficulty_readme(diff)
    else:
        counts[diff] = 0

generate_root_readme(counts)
print("✅ READMEs generated")