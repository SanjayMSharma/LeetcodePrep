import com.interviewPrep.educative.algorithms.binarysearch.CeilingOfANumber;
import com.interviewPrep.educative.algorithms.binarysearch.NumberRange;
import com.interviewPrep.educative.algorithms.binarysearch.OrderAgnostic;
import com.interviewPrep.educative.algorithms.mergeIntervals.MergeIntervals;
import com.interviewPrep.educative.algorithms.recursion.EqualSubsetSum;
import com.interviewPrep.educative.algorithms.recursion.Knapsack01;
import com.interviewPrep.educative.algorithms.recursion.ReverseString;
import com.interviewPrep.educative.algorithms.subsets.BalancedParentheses;
import com.interviewPrep.educative.algorithms.subsets.Permutations;
import com.interviewPrep.educative.algorithms.subsets.SubsetsWithDuplicates;
import com.interviewPrep.educative.algorithms.topKElements.*;
import com.interviewPrep.educative.algorithms.topologicalSort.TopologicalSort;
import com.interviewPrep.educative.dataStructures.LinkedList.HappyNumber;
import com.interviewPrep.educative.dataStructures.LinkedList.LinkedListCycle;
import com.interviewPrep.educative.dataStructures.LinkedList.LinkedListCycleLength;
import com.interviewPrep.educative.dataStructures.arrays.MergeTwoSortedArray;
import com.interviewPrep.educative.dataStructures.tree.BFS.BinaryTreeLevelOrderTraversal;
import com.interviewPrep.interview.Interview;
import com.interviewPrep.leetCode.Amazon.TopKFrequentWords;
import com.interviewPrep.leetCode.easy.*;
import com.interviewPrep.leetCode.easy.array.*;
import com.interviewPrep.leetCode.easy.dynamicProgramming.BestTimeBuySellStock;
import com.interviewPrep.leetCode.easy.linkedlist.IntersectionOfTwoLinkedLists;
import com.interviewPrep.leetCode.easy.linkedlist.PalindromeLinkedList;
import com.interviewPrep.leetCode.easy.linkedlist.ReverseLinkedList;
import com.interviewPrep.leetCode.easy.recursion.MinCostClimbingStairs;
import com.interviewPrep.leetCode.easy.recursion.MinimumDistanceBetweenBST;
import com.interviewPrep.leetCode.easy.recursion.dynamicProgramming.HouseRobber;
import com.interviewPrep.leetCode.easy.recursion.dynamicProgramming.KEqualSumSubsets;
import com.interviewPrep.leetCode.easy.recursion.dynamicProgramming.PaintHouse;
import com.interviewPrep.leetCode.easy.recursion.dynamicProgramming.RangeSumQueryImmutable;
import com.interviewPrep.leetCode.easy.string.*;
import com.interviewPrep.leetCode.easy.trees.BinaryTreeInorderTraversal;
import com.interviewPrep.leetCode.easy.trees.IncreasingOrderSearchTree;
import com.interviewPrep.leetCode.easy.trees.NAry_Tree_MaximumDepth;
import com.interviewPrep.leetCode.medium.TopKIntElements;
import com.interviewPrep.leetCode.medium.arrays.Subsets;
import com.interviewPrep.leetCode.medium.linkedList.LinkedListCycleII;
import com.interviewPrep.leetCode.medium.recursion.dynamicprogramming.*;
import com.interviewPrep.leetCode.medium.slidingwindow.LongestSubstringMostKDistinctCharacters;
import com.interviewPrep.leetCode.medium.string.GenerateNLevelParentheses;
import com.interviewPrep.leetCode.medium.topologicalsort.CourseSchedule;
import com.interviewPrep.leetCode.medium.topologicalsort.CourseSchedule2;
import com.interviewPrep.leetCode.medium.tree.KthSmallestElementBST;
import com.interviewPrep.models.*;
import com.interviewPrep.models.Utils.TrieUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class mainApp {
    public static void main(String args[]) {
        Logger LOGGER = LoggerFactory.getLogger(mainApp.class);
//        System.out.println("Hello World");
/*//    AlgoExp E   Q8] BINARY SEARCH
        int[] sortedArray = {2,4,6,8,10,12,14,16,18,20};
        int target = 14;
        BinarySearch bS = new BinarySearch();
        int result = bS.binarySearch(sortedArray, target);
        System.out.println(result);
        */

/*//    AlgoExp E   Q10 BUBBLE SORT
        BubbleSort bS = new BubbleSort();
        int[] array = {9,3,2,5,7,2,5,9,34,5,8,2,6,9,4,5,7,1,0,42,7};
        int[] sortedArray = bS.bubbleSort(array);
        for (int element: sortedArray) {
            System.out.print(element + " ");
        }*/

//      AlgoExp E Q11 INSERTION SORT
       /* int[] array = {9,3,2,5,7,2,5,9,34,5,8,2,6,9,4,5,7,1,0,42,70};
        int[] arraySecond = {9,0,8,1,7,2,6,3,5,4,4,5,3,6,2,7,1,8,0,9};
        int[] arrayThird = {9,0,8,1,7};
        InsertionSort iS = new InsertionSort();
        int[] sortedArray = iS.insertionSort(array);
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }*/

//       AlgoExp E Q12 SELECTION SORT
        /*int[] unSortedArray = {9,0,8,1,7,2,6,3,5,4,4,5,3,6,2,7,1,8,0,9};
        SelectionSort sS = new SelectionSort();
        int[] sortedArray = sS.selectionSort(unSortedArray);
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }*/

//      AlgoExp E Q13 PALINDROME CHECK
        /*String palindromeString = "deeptiitpeed";
        String nonPalindromeString = "deeptiMottu";
        String palindrom4Letters = "abba";
        String palindrom3Letters = "aba";
        String singleCharDiff = "deeptiitpead";
        PalindromeCheck pC = new PalindromeCheck();
        Boolean result = pC.isPalindrome(singleCharDiff);
        System.out.println(result);*/

//      AlgoExp E: Q14 Caesar Cipher Encryptor
        /*CaeserCipherEncryptor cCE = new CaeserCipherEncryptor();
        String StillPending = "";*/

//      AlgoExp  H: Q26 Quick Sort INCOMPLETE
        /*QuickSort qS = new QuickSort();
        int[] unSortedArray = {9,0,8,1,7,2,6,3,5,4,4,5,3,6,2,7,1,8,0,9};
        int[] unSortedArray2 = {3,2,1};
        int[] singleElementArray = {1};
        int[] sortedArray = qS.quickSort(unSortedArray2);
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }*/

//      LeetCode E: Q.283 Move Zeroes
       /* MoveZeroes Mz = new MoveZeroes();
        int[] unSortedArray = {0,1,0,3,12};
        int[] outPutArray = Mz.moveZeroes(unSortedArray);
        for (int element: outPutArray) {
            System.out.print(element + " ");
        }*/

//      LeetCode M: Q.11 Container With Most Water
        /*ContainerWithMostWater cwm = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.print(cwm.findArea(height));*/


//      Leetcode Amazon | OA 2019 | Top N Buzzwords INCOMPLETE
        /*int numToys = 6;
        int topToys = 2;
        List<String> toys = new ArrayList<String>(Arrays.asList("elmo", "elsa", "legos", "drone", "tablet", "warcraft"));
        int numQuotes = 6;
        List<String> quotes = new ArrayList<>(Arrays.asList(
                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                "The new Elmo dolls are super high quality",
                "Expect the Elsa dolls to be very popular this year, Elsa!",
                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"));

        TopNBuzzwords topNToys = new TopNBuzzwords();
        List<String> TopToys = topNToys.topNToys(numToys, topToys, toys, numQuotes, quotes);
        for (String toy: TopToys) {
            System.out.print(toy + " ");
        }*/

//      AlgoExp M: Longest Palindromic SubString & LeetCode E:125 Palindrome Check | LC 99%
        /*PalindromeCheck pCheck = new PalindromeCheck();
        String palindromeString = "deeptiitpeed";
        String palindromeStringSecond = "race a car";
        String nonPalindromeString = "deeptiMottu";
        String palindrom4Letters = "abba";
        String palindrom3Letters = "aba";
        String singleCharDiff = "deeptiitpead";
        String emptyStr = "    ";
        String specialStr = ",; W;:GlG:;l ;,";
        String specialStr2 = "A man, a plan, a canal: Panama";
        boolean isPalindrome =  pCheck.isPalindrome(specialStr2);
        System.out.print("Is Palindrome:: " + isPalindrome);*/

//      LeetCode E: 680. Valid Palindrome II | LC 95%
        /*PalindromeCheck2 pCheck2 = new PalindromeCheck2();
        String specialStr = ",; W;:GlG:;l ;,";
        String specialStr2 = ",; W;:GlG:;w ;,";
        String oneCharDiff = "aabaaabbccbbaaabwaa";
        String longDiff = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean isPalindrome =  pCheck2.validPalindrome(longDiff);
        System.out.print(isPalindrome);*/

//      LeetCode E: 1108. Defanging an IP Address
        /*DefangingIPAddress dA = new DefangingIPAddress();
        String iP = "198.168.1.255";
        String newIp = dA.defangIPaddr(iP);
        System.out.print(newIp);*/

//      LeetCode E: 1313.  Decompress Run-Length Encoded List
        /*DecompressRLElist dL = new DecompressRLElist();
        int[] eL = {1,2,3,4};
        int[] nDL = dL.decompressRLElist(eL);
        for (int elm : nDL) {
            System.out.print(elm);
        }*/

//      LeetCode TIQ E:26 Remove Duplicates from Sorted Array DONE

//      LeetCode E:121 Best Time to Buy and Sell Stock
        /*SellStockII sS = new SellStockII();
        int[] prices = {3,3,5,0,0,3,1,4};
        int profit = sS.maxProfit(prices);
        System.out.print(profit);*/

//      LeetCode TIQ E. 122: Best Time to Buy and Sell Stock II
        /*SellStockII ss2 = new SellStockII();
        int[] prices = {6,1,3,2,4,7};
        int profit = ss2.maxPRofit2(prices);
        System.out.print(profit);*/


//      LeetCode TIQ String E: 1 Reverse String
        /*ReverseString rs = new ReverseString();
        char[] charStr = {'D','E','E','P','T','I'};
        char[] rtnChar = rs.reverseString(charStr);
        int num = -123;
        int revNum = rs.reverseInt(num);
        System.out.println(revNum + " num");
        for(char elm : rtnChar) {
            System.out.print(elm + " ");
        }*/


//      LeetCode E: 1114. Print In Order | concurrency(Multithreading) |


//      LeetCode E: 136 Single Number
        /*SingleNumber sN = new SingleNumber();
        int[] nums =  {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,1,1,1,9};
        int sNum = sN.singleNumber2(nums);
//        int sNum = sN.singleNumber(nums);
        System.out.print(sNum);*/

//      LeetCode E 665. Non-decreasing Array
        /*NonDecreasingArray nDA = new NonDecreasingArray();
        int[] nums = {3,4,2,3};
        boolean isDec = nDA.checkIfNonDecreasing(nums);
        System.out.print(isDec);*/

//      LeetCode M. 289 Game of Life


//      LeetCode E. 387: First Unique Character in a String

//      LeetCode E: 1221. Split a String in Balanced Strings
        /*String balancedStr = "RLRRLLRLRL";
        String nullbalancedStr = "LlrR";

        BalancedString bS = new BalancedString();
        int totalSubStr = bS.balancedStringSplit(nullbalancedStr);
        System.out.print(totalSubStr);*/

//      LeetCode E: 709. To Lower Case
        /*String str = "Hello";
        ToLowerCase tL = new ToLowerCase();
        String lowStr = tL.toLowerCase(str);
        System.out.print(lowStr);*/

//      Leetcode E: 1370. Increasing Decreasing String => 5%
       /* String unsortedStr = "aaaabbbbcccc";
        String unsortedStr2 = "leetcode";
        IncreasingDecreasingString iDS = new IncreasingDecreasingString();
        String rsltStr = iDS.sortString(unsortedStr2);
        System.out.print(rsltStr);*/

//     LeetCode E: 1309. Decrypt String from Alphabet to Integer Mapping => 100%
        /*String str = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String charStr = "26#";
        IntegerToAlphabet iA = new IntegerToAlphabet();
        String rtnStr = iA.intToAlpha(str);
        System.out.print(rtnStr);*/

//      LeetCode E: 938. Range Sum of BST => 100%
        /*int[] allElm = {10,5,15,3,7,0,18};
        InsertIntoTreeNode insertIntoTree = new InsertIntoTreeNode();
        TreeNode tree = insertIntoTree.insertAll(allElm);
        RangeSumBST rSum = new RangeSumBST();
        int sum = rSum.rangeSumBST(tree, 7, 15);
        System.out.print(sum);*/

//      LeetCode E: 589. N-ary Tree Preorder Traversal  => 5%
        /*Node leaf6 = new Node(6);
        Node leaf5 = new Node(5);
        List<Node> child3 = new ArrayList<>();
        child3.add(leaf5);
        child3.add(leaf6);
        Node branch2 = new Node(2);
        Node branch3 = new Node(3, child3);
        Node branch4 = new Node(4);
        List<Node> child1 = new ArrayList<>();
        child1.add(branch3);
        child1.add(branch2);
        child1.add(branch4);
        Node root = new Node(1, child1);

        PreOrderNode preOdrNode = new PreOrderNode();
        List<Integer> preOrdVal =  preOdrNode.preorder(root);
        for (int elm : preOrdVal) {
            System.out.print(elm);
        }*/

//      LeetCode E: 590. N-ary Tree Postorder Traversal  => 8%
       /* Node leaf6 = new Node(6);
        Node leaf5 = new Node(5);
        List<Node> child3 = new ArrayList<>();
        child3.add(leaf5);
        child3.add(leaf6);
        Node branch2 = new Node(2);
        Node branch3 = new Node(3, child3);
        Node branch4 = new Node(4);
        List<Node> child1 = new ArrayList<>();
        child1.add(branch3);
        child1.add(branch2);
        child1.add(branch4);
        Node root = new Node(1, child1);
        PostOrderNode postOrd = new PostOrderNode();
        List<Integer> postOrdRes = postOrd.postOrderNode(root);
        for(int elm : postOrdRes) {
            System.out.print(elm);
        }*/

//      LeetCode E: 617. Merge Two Binary Trees  => 22%
        /*MergeTwoBinaryTree mrgTwoBinaryTree = new MergeTwoBinaryTree();
        int[] fstElm = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,2};
        int[] secElm = {1,0,1,0,1,0,1,0,1,0,1,2};
        InsertIntoTreeNode inTN = new InsertIntoTreeNode();
        TreeNode firstTree = inTN.insertAllTree(fstElm);
        TreeNode secondTree = inTN.insertAllTree(secElm);

        TreeNode rtnMrgTree = mrgTwoBinaryTree.mergeTrees(firstTree, secondTree);
        inTN.printTree(rtnMrgTree);*/

//      LeetCode E: 257. Binary Tree Paths  => Not able to complete


//      Leetcode Amazon OA M: 692. Top K Frequent Words  => 99%
        /*List<String> totalElm = new ArrayList<String>(
                Arrays.asList("i", "love", "leetcode", "i", "love", "coding")
        );
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;

        TopKFrequentWords topCount = new TopKFrequentWords();

        List<String> topWords = topCount.topKFrequentWords(words, k);
        for(String word : topWords) {
            System.out.println(word);
        }*/

//      LeetCode M: 208. Implement Trie (Prefix Tree)  => 74%

//      Leetcode M: 347. Top K Frequent Elements  => Not a Correct approach
        /*int[] nums = {1,2,1,3,1,4,2,3,4,1,1,3,4,2,1,1,2,5,3,};
        int k = 2;
        TopKIntElements topNumsEle = new TopKIntElements();
        List<Integer> topNums = topNumsEle.topKFrequent(nums, k);
        for(int num : topNums) {
            System.out.println(num);
        }*/

//      LeetCode M: 994. Rotting Oranges  => 20 %


//      LeetCode E: 897. Increasing Order Search Tree => Pending

//      LeetCode E: 111. Minimum Depth of Binary Tree  => 8% Not a correct way to solve


//      LeetCode E: 448. Find All Numbers Disappeared in an Array => 35%

//      LeetCode E: 169. Majority Element =>
        /*MajorityElement mE = new MajorityElement();
        int[] elemts = {3,3,4};
        int result = mE.majorityElement(elemts);
        System.out.println(result);*/


//      LeetCode E: 206. Reverse Linked List =>  100%
       /* ListNode lNode = new ListNode(1);
        ListNode head = lNode;
        for(int val = 2; val < 5; val++) {
            lNode.next = new ListNode(val);
            lNode = lNode.next;
        }
        ReverseLinkedList rLL = new ReverseLinkedList();
        ListNode rRLL = rLL.reverseList(head);
        while (rRLL != null) {
            System.out.println(rRLL.val);
            rRLL = rRLL.next;
        }*/

//      LeetCode E: 70. Climbing Stairs

//      LeetCode E: 897. Increasing Order Search Tree
        /*TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node8 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);

        node8.left = node7;
        node8.right = node9;
        node6.right = node8;

        node2.left = node1;
        node3.left = node2;
        node3.right = node4;

        node5.right = node6;
        node5.left = node3;

        IncreasingOrderSearchTree inOrder = new IncreasingOrderSearchTree();

        inOrder.inOrder(node5);*/

//      LeetCode E: 1. Two Sum
        /*int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum tS = new TwoSum();
        tS.twoSum(nums, target);*/

//      LeetCode M: 15. 3Sum = Incomplete

//      LeetCode E: 559. Maximum Depth of N-ary Tree
        /*Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> childNode = new ArrayList<>();
        childNode.add(node5);
        childNode.add(node6);
        Node node4 = new Node(4);
        Node node3 = new Node(3, childNode);
        Node node2 = new Node(2);
        List<Node> rootChild = new ArrayList<>();
        rootChild.add(node3);
        rootChild.add(node4);
        rootChild.add(node2);
        Node node1 = new Node(1, rootChild);
        NAry_Tree_MaximumDepth nAry = new NAry_Tree_MaximumDepth();
        nAry.maxDepth(node1);*/


//      Leetcode E: 1431. Kids With the Greatest Number of Candies
        /*GreatestNumberCandies gC = new GreatestNumberCandies();
        int[] candies = {2,3,5,1,3};
        gC.kidsWithCandies(candies, 3);*/


//      Kadane's algorithm Maximum subarray

//      LeetCode E: 509. Fibonacci Number


//      Educative Array: Merge Tow Sorted Array
        /*int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        MergeTwoSortedArray mS = new MergeTwoSortedArray();
        int[] rtnArry = mS.mergeTeo(arr1, arr2);
        for (int elm :
                rtnArry) {
            System.out.println(elm);
        }*/


//      LeetCode M: 102. Binary Tree Level Order Traversal
        /*TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node8 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);

        node8.left = node7;
        node8.right = node9;
        node6.right = node8;

        node2.left = node1;
        node3.left = node2;
        node3.right = node4;

        node5.right = node6;
        node5.left = node3;

        TreeNode nullTreeNode = new TreeNode();
        BinaryTreeLevelOrderTraversal bTL = new BinaryTreeLevelOrderTraversal();
        bTL.traverse(nullTreeNode);*/


//      Educative Top 'K' Elements: Connect Ropes
        /*int[] ropes = {1, 3, 11, 5};
        ConnectRopes cr = new ConnectRopes();
        cr.minimumCostToConnectRopes(ropes);*/

//      Educative Top 'K' Elements: Frequency Sort
        /*String str = "abcbab";
        StrCharFrequencySort sSort = new StrCharFrequencySort();
        sSort.sortCharacterByFrequency(str);*/

//      Educative Top 'K' Elements: Maximum Distinct Elements
        /*int[] nums = {7, 3, 5, 8, 5, 3, 3};
        int k = 2;
        MaximumDistinctElements mD = new MaximumDistinctElements();
        mD.maxDistinct(nums, k);*/


//      Educative Top 'K' Elements: Rearrange String
        /*String str = "Programming";
        RearrangeString rs = new RearrangeString();
        String rtnString = rs.rearrangeStr(str);
        System.out.println(rtnString);*/

//      Educative Top 'K' Elements: Rearrange String K Distance Apart
        /*String str = "Programming";
        DistanceRearrangeString ds = new DistanceRearrangeString();
        String rth = ds.rearrange(str, 10);
        System.out.println(rth);*/

//      Educative Top 'K' Elements: Scheduling Tasks
/*        char[] tasks = {'a','a','a','a','b','b','c','d','e','f','g','h','i','j','k'};
        char[] tasks2 = {'a','a','a','b','c','c'};
        char[] tasks3 = {'a','a','c'};

        char[] task4 = {'A','B','C','D','E','A','B','C','D','E'};
        SchedulingTasks sT = new SchedulingTasks();
        int totalTime = sT.schedulingtasks(task4, 4);
        System.out.println(totalTime);
    }*/

//      Educative - Merge Intervals: Merge Intervals
/*        Interval inter1 = new Interval(1, 4);
        Interval inter2 = new Interval(2, 6);
        Interval inter3 = new Interval(3, 5);
//        Interval inter1 = new Interval();
//        Interval inter1 = new Interval();
//        Interval inter1 = new Interval();
//        Interval inter1 = new Interval();

        List<Interval> intervals = new ArrayList<>();
        intervals.add(inter1);
        intervals.add(inter2);
        intervals.add(inter3);
        MergeIntervals mI = new MergeIntervals();
        List<Interval> mergedIntr = mI.merge(intervals);
        for (Interval intr : mergedIntr)
            System.out.println(intr.start +" " + intr.end); */


//      Educative - Subsets - Subsets
/*        int[] nums = {1, 2, 2};
        Subsets subSet = new Subsets();
        List<List<Integer>> rtnList= subSet.findSubset(nums);
        System.out.println(rtnList);*/

//      Educative - Subsets - Subsets With Duplicates
/*        int[] nums = {1, 2, 3, 3};
        SubsetsWithDuplicates subSet = new SubsetsWithDuplicates();
        List<List<Integer>> rtnList= subSet.findSubSet(nums);
        System.out.println(rtnList);*/

//      Educative - Subsets - Permutations
       /* int[] nums = {1, 3, 5};
        Permutations p = new Permutations();
        List<List<Integer>> rtnL = p.findPermutations(nums);
        System.out.println(rtnL);*/

//     LeetCode E: 392. Is Subsequence : Time Limit Exceeded
        /*String target = "ahbgdc";
        String subStr = "abc";
        IsSubsequence sS = new IsSubsequence();
        boolean isSub = sS.isSubsequence(subStr, target);*/

//      Educative: Subsets - Balanced Parenthese
        /*BalancedParentheses blP = new BalancedParentheses();
        System.out.println(blP.generateValidParentheses(4));*/

//      LeetCode: E: ?. Reverse String
        /*ReverseString revS = new ReverseString();
        System.out.println(revS.reverseThis("Deepti"));*/

//      Educative: 0/1 Knapsack : 0/1 Knapsack
        /*int[] profit = {4, 5, 3, 7 };
        int[] weight = {2, 3, 1, 4 };
        Knapsack01 kNap = new Knapsack01();
        System.out.println(kNap.solveKnapsack(profit, weight, 5));*/

//      LeetCode: 783. Minimum Distance Between BST Nodes :

        /*TreeNode node52 = new TreeNode(52);
        TreeNode node89 = new TreeNode(89);
        TreeNode node49 = new TreeNode(49);
        TreeNode node69 = new TreeNode(69);
        TreeNode node90 = new TreeNode(90);

        node49.right = node52;
        node69.left = node49;
        node69.right = node89;
        node90.left = node69;

        MinimumDistanceBetweenBST mtn = new MinimumDistanceBetweenBST();

        System.out.println(mtn.minDiffInBST(node90));*/

//      LeetCode: 256. Paint House => need to go through again
/*        int[][] costs = {{17,2,17},{16,16,5},{14,3,19}};
        int[][] costs2 = {{3,5,3},{6,17,6},{7,13,18},{9,10,18}};

        PaintHouse pH = new PaintHouse();
        System.out.println(pH.minCost(costs2));*/


//      LeetCode:E 746. Min Cost Climbing Stairs => Recursion withDynamic programming
/*        int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] costs2 = {10, 15, 20};
        MinCostClimbingStairs ms = new MinCostClimbingStairs();
        System.out.println(ms.minCostClimbingStairs(costs2));*/


//      LeetCode:E 303. Range Sum Query - Immutable => did not come up with the optimal solution
    /*    RangeSumQueryImmutable em = new RangeSumQueryImmutable();
        int[] nums = {-2, 0, 3, -5, 2, -1};
        int[] nums2 = {10, 20, 30, 40};
        int[] nums3 = {};
        em.NumArray(nums3);
        System.out.println(em.sumRange(0, 0));*/


//      LeetCode: E 198. House Robber => One test case failed
        /*int[] houses = {2,7,9,3,1};
        HouseRobber hr = new HouseRobber();
        System.out.println(hr.rob(houses));*/

//        LeetCode: M 1277. Count Square Submatrices with All Ones => Not the optimal solution
        /*int[][] matrix = {{}, {}, {}, {}, } ;
        int[][] matrix = {{0,1,1,1}, {1,1,1,1}, {0,1,1,1}, {0,1,1,1} } ;
        int[][] matrix2 = {};
        CountSquareSubmatrices cs = new CountSquareSubmatrices();
        System.out.println(cs.countSquares(matrix2));*/

//
        /*EqualSubsetSum es = new EqualSubsetSum();
        int[] nums = {2,2,3,5};
        System.out.println(es.canPartition(nums));*/

//       LeetCode: M  698. Partition to K Equal Sum Subsets
       /* int[] nums = {10,10,10,7,7,7,7,7,7,6,6,6};
        KEqualSumSubsets ks = new KEqualSumSubsets();
        System.out.println(ks.canPartitionKSubsets(nums, 3));*/

//       LeetCose: M 1048. Longest String Chain => 80% Recursively done, Iteratively pending
      /*  String[] str = {"a","b","ba", "bda","bdca"};
        LongestStringChain lC = new LongestStringChain();
        System.out.println(lC.longestStrChain(str));*/

//        LeetCode M: 5. Longest Palindromic Substring
        /*String str = "babaddtattarrattatddetartrateedredividerb";
        LongestPalindromicSubstring lp = new LongestPalindromicSubstring();
        System.out.println(lp.longestPalindrome(str));*/

//       LeetCode 121. Best Time to Buy and Sell Stock
       /* BestTimeBuySellStock sS = new BestTimeBuySellStock();
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.print(sS.maxProfit(prices));*/

//       LeetCode M: 1143. Longest Common Subsequence
        /*String str1 = "ace";
        String str2 = "abe";
        String str11 = "bsbi";
        String str21 = "jkb";
        LongestCommonSubsequence ls = new LongestCommonSubsequence();
        System.out.println(ls.longestCommonSubsequence(str11, str21));*/

//        E Topological Sort
       /* TopologicalSort ts = new TopologicalSort();
        int[][] edges = {{3,2},{3,0},{2,0},{2,1}};
        System.out.println(ts.sort(4, edges));*/

//       LeetCode: M 207. Course Schedule => 24% 12%
        /*int[][] courses = {{1,0}, {0, 3}, {0, 2}, {3,2}, {2,5}, {4,5}, {5,6}, {2,4}};
        CourseSchedule cs = new CourseSchedule();
        System.out.println(cs.canFinish( 7, courses));*/

//        LetCode: M 210. Course Schedule II
/*        int[][] courses = {{1,0}, {0, 3}, {0, 2}, {3,2}, {2,5}, {4,5}, {5,6}, {2,4}};
        int[][]cour = {{0,1},{1,0}};
        CourseSchedule2 cs = new CourseSchedule2();*/

//        int[] orderedCourse =  cs.findOrder( 7, courses);
        /*int[] orderedCourse =  cs.findOrder( 2, cour);
        for (int indx = 0; indx < orderedCourse.length; indx++) {
            System.out.print(orderedCourse[indx ]);
        }*/

//        Educative: Fast & Slow pointers LinkedList Cycle
       /* LinkedListCycleLength lc = new LinkedListCycleLength();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(lc.findCycleLength(head));*/

//       Educative: Fast & Slow pointers Happy Number
        /*HappyNumber hn = new HappyNumber();
        System.out.println(hn.find(12));*/

//        160. Intersection of Two Linked Lists
   /*     ListNode headA = new ListNode();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        headA.next = node1;
        ListNode headB = new ListNode();
        ListNode node10 = new ListNode(10);
        ListNode node20 = new ListNode(20);
        ListNode node30 = new ListNode(30);
        node10.next = node20;
        node20.next = node30;
        headB.next = node10;
        ListNode node100 = new ListNode(100);
        ListNode node200 = new ListNode(200);
        ListNode node300 = new ListNode(300);
        node100.next = node200;
        node200.next = node300;
        node5.next = node100;
        node30.next = node100;

        IntersectionOfTwoLinkedLists iL = new IntersectionOfTwoLinkedLists();
        System.out.println(iL.getIntersectionNode(headA, headB).val);*/


//   LeetCode E: 234. Palindrome Linked List
/*        *//*ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(14);
        ListNode node5 = new ListNode(5);
        ListNode node14 = new ListNode(41);
        ListNode node13 = new ListNode(3);
        ListNode node12 = new ListNode(2);
        ListNode node11 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node14;
        node14.next = node13;
        node13.next = node12;
        node12.next = node11;*//*

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node21 = new ListNode(12);
        ListNode node11 = new ListNode(1);
        node21.next = node11;
        node2.next = node21;
        node1.next = node2;

        PalindromeLinkedList pl = new PalindromeLinkedList();
        System.out.println(pl.isPalindrome(node1));*/

//      LeetCode M:  142. Linked List Cycle II
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node3;

        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);

        node11.next = node12;

        LinkedListCycleII lc = new LinkedListCycleII();
        System.out.println(lc.detectCycle(node11).val);*/


//        LeetCode E: 581. Shortest Unsorted Continuous Subarray

//        LeetCode M: 94. Binary Tree Inorder Traversal
    /*    TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node2.left = node1;
        node2.right = node3;

        node5.left = node4;
        node5.right = node6;

        root.left = node2;
        root.right = node5;

        BinaryTreeInorderTraversal bIn = new BinaryTreeInorderTraversal();
        System.out.println(bIn.inorderTraversal(root));*/

//      LeetCode M: 230. Kth Smallest Element in a BST
/*        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node2.left = node1;
        node2.right = node3;

        node6.left = node5;
        node6.right = node7;

        root.left = node2;
        root.right = node6;

        TreeNode emptyRoor = new TreeNode(1000);
        KthSmallestElementBST kL = new KthSmallestElementBST();
//        int kthElm = kL.kthSmallest(root, 7);
        int emtkthElm = kL.kthSmallest(null, 1);*/

//      Leetcode: 337. House Robber III
       /* TreeNode root = new TreeNode(3);
        TreeNode level1L = new TreeNode(2);
        TreeNode level1R = new TreeNode(3);
        TreeNode level2r = new TreeNode(3);
        TreeNode level2rr = new TreeNode(1);
        level1L.right = level2r;
        level1R.right = level2rr;
        root.left = level1L;
        root.right = level1R;


        *//*TreeNode root = new TreeNode(2);
        TreeNode level1L = new TreeNode(1);
        TreeNode level1r = new TreeNode(3);
        TreeNode level1Lr = new TreeNode(4);
        level1L.right = level1Lr;
        root.left = level1L;
        root.right = level1r;*//*

        HouseRobberIII hr = new HouseRobberIII();*/

//        LeetCode M: 105. Construct Binary Tree from Preorder and Inorder Traversal

       /* TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        node6.right = node8;
        node6.left = node7;
        node4.right = node5;
        node3.right = node4;
        node2.right = node3;
        root.left = node2;
        root.right = node6;
        int[] inOrder = {2,3,4,5,1,7,6,8};
        int[] preOrder = {1,2,3,4,5,6,7,8};

        int[] inOrder2 = {2,1};
        int[] preOrder2 = {1,2};

        BTByPreorderInorder bt = new BTByPreorderInorder();
        TreeNode rtnTree = bt.buildTree(preOrder2, inOrder2);*/

//       LeetCode E: 13. Roman to Integer
//        Roman2Integer rI = new Roman2Integer();

//        LeetCode E: 14. Longest Common Prefix
        /*LongestCommonPrefix lp = new LongestCommonPrefix();
        String fString = "flow";
        String sStr = "flight";
        String tStr = "flower";
        String[] strArr = new String[3];
        strArr[0] = fString;
        strArr[1] = sStr;
        strArr[2] = tStr;
        System.out.println( lp.longestCommonPrefix(strArr));*/

//        LeetCode E: 28. Implement strStr()

       /* String hay = "mississippi";
        String needle = "issipi";

        ImplementStrStr im = new ImplementStrStr();*/

//       LeetCode M: 22. Generate Parentheses
//        GenerateNLevelParentheses gp = new GenerateNLevelParentheses();


//        LeetCode M: 78. Subsets
        /*int[] nums = {1,2,3};
        Subsets ss = new Subsets();*/


//        LeetCode E: 733. Flood Fill
       /* FloodFill ff = new FloodFill();
        int[][] image = {{0,0,0},{0,1,1}};*/

//       LeetCode E: 937. Reorder Data in Log Files -> not complete
        /*ReorderDataLog rd = new ReorderDataLog();
        String[] logs = {"j je", "b fjt", "7 zbr", "m le", "o 33"};
        for (String log: rd.reorderLogFiles(logs))*/

//        Leetcode E: 819. Most Common Word
        /*String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        MostCommonWord mw = new MostCommonWord();
        System.out.println(mw.mostCommonWord(paragraph, banned));*/

//        LeetCode E: 704. Binary Search || Educative: Modified Binary Search: Order-agnostic Binary Search
        /*int[] nums = {10, 6, 4};
        OrderAgnostic oA = new OrderAgnostic();*/

//      Educative: Modified Binary Search Ceiling of a Number
       /* CeilingOfANumber cN = new CeilingOfANumber();
        int[] nums = {1,4,6,9,10};*/

//       Educative: Next Letter

//       Educative: Number Range
        /*int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        NumberRange nr = new NumberRange();
        System.out.println(nr.findRange(arr, 2));*/

       /* Interview in = new Interview();
        Map<String, Integer> rtnCounters = in.countWords("abc abc def def abc def xyz abc");
        System.out.println(rtnCounters.toString());*/

//       Leetcode: 53. Maximum Subarray
        /*MaximumSubarray ms = new MaximumSubarray();
        int[] nums = new int[9];
        nums[0] = -2;
        nums[1] = 1;
        nums[2] = -3;
        nums[3] = 4;
        nums[4] = -1;
        nums[5] = 2;
        nums[6] = 1;
        nums[7] = -5;
        nums[8] = 4;
        System.out.println( ms.maxSubArray(nums));*/

//        Leetcode: 340. Longest Substring with At Most K Distinct Characters
        LongestSubstringMostKDistinctCharacters lC = new LongestSubstringMostKDistinctCharacters();
        System.out.println( lC.lengthOfLongestSubstringKDistinct("aabcse", 1));




    }

}
