# 🧠 AllMyQuestions — DSA Practice in Java

![Problems Solved](https://img.shields.io/badge/Problems%20Solved-75%2B-brightgreen?style=flat-square)
![Language](https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=java)
![Status](https://img.shields.io/badge/Status-Actively%20Maintained-blue?style=flat-square)
![Stars](https://img.shields.io/github/stars/prasad0411/AllMyQuestions?style=flat-square&color=yellow)

> Structured, well-commented DSA solutions in Java — organized by data structure and pattern.  
> Every solution follows a consistent approach: problem restatement → edge cases → brute force → optimal solution → TC/SC analysis.

---

## 📁 Repository Structure

| Folder | Topics Covered |
|---|---|
| [`arrays/`](./arrays) | Sliding window, two pointers, prefix sum, kadane's algorithm |
| [`strings/`](./strings) | Anagrams, pattern matching, palindromes |
| [`linked-list/`](./linkedList) | Reversal, cycle detection, merge, palindrome |
| [`stacks/`](./stacks) | Monotonic stack, next greater element, implementation |
| [`queues/`](./queues) | BFS patterns, deque-based problems |
| [`heap/`](./heap) | Top-K problems, priority queue patterns |
| [`hashmap/`](./hashmap) | Frequency maps, two-sum variants |
| [`hashset/`](./hashset) | Duplicate detection, set operations |
| [`treemap/`](./treemap) | Ordered map problems |
| [`arraylist/`](./arraylist) | Dynamic array patterns |
| [`searching/`](./searching) | Binary search (1D, 2D, search space) |
| [`sorting/`](./sorting) | Merge sort, quick sort, counting sort |
| [`recursion/`](./recursion) | Pattern-wise recursion, backtracking foundations |
| [`binary-trees/`](./treemap) | Traversals, LCA, path problems |
| [`patterns/`](./patterns) | Cross-cutting problem patterns |
| [`basic/`](./basic) | Fundamentals and warm-up problems |

---

## 🧩 Solution Format

Every file in this repo follows the same structured template:

```java
// LC: 485. Max Consecutive Ones
// PROBLEM: Given a binary array, return the maximum number of consecutive 1s.

// CONSTRAINTS:
// - Array contains only 0s and 1s
// - Return type: int

// EDGE CASES:
// - null or empty array → return 0
// - all 0s → return 0
// - all 1s → return array length
// - single element → return that element

// BRUTE FORCE: O(n²) — for each index, scan forward counting 1s

// OPTIMAL APPROACH:
// Single pass with two variables: a running counter that resets on 0,
// and a global max updated whenever the streak grows.

// TC: O(n) — single pass
// SC: O(1) — no extra data structures
```

---

## 🎯 Problem Solving Framework

Each problem is approached using this 7-step framework:

1. **Understand & Restate** — paraphrase the problem in plain English
2. **Clarify Edge Cases** — null, empty, single element, all min/max values
3. **State Constraints** — input size, value ranges, return type
4. **Explain Brute Force** — even briefly, to show the problem space
5. **Explain Optimal Approach** — intuition first, before writing code
6. **Implement with Commentary** — narrate key decisions inline
7. **Conclude with TC/SC** — and note any trade-offs or follow-up variants

---

## 📊 Progress Tracker

| Category | Problems |
|---|---|
| Arrays | 40 |
| Binary Search | 32 |
| Graphs | 53 |
| Dynamic Programming | 55 |
| Linked Lists | 31 |
| Trees | 38 |
| Stack & Queue | 30 |
| Heap | 17 |
| Recursion | 25 |
| Greedy | 15 |
| Strings | 15+ |
| Bit Manipulation | 18 |
| Tries | 7 |

---

## 🚀 About

This repository is part of active interview preparation for SDE and ML Engineering roles.  
Problems are sourced from **LeetCode**, **Striver's A2Z Sheet**, and company-specific interview prep.

**Tech:** Java 17 · VS Code · Organized by topic and difficulty

---

## 🔗 Connect

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Prasad%20Kanade-0077B5?style=flat-square&logo=linkedin)](https://linkedin.com/in/prasad-kanade)
[![Portfolio](https://img.shields.io/badge/Portfolio-prasad0411.github.io-black?style=flat-square&logo=github)](https://prasad0411.github.io/Prasad-Portfolio)
[![LeetCode](https://img.shields.io/badge/LeetCode-prasad0411-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/prasad0411)
