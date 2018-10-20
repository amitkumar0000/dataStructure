# dataStructure

Tree
======
1. BFS: Inorder, Preorder, Postorder
2. DFS: LevelOrder using Queue, LevelOrder Using Counter, LevelOrder Recursion

B-Tree and B+-Tree(BplusTree)
===============================
1. Disk Strucutre:  Sector, Track and Block.
2. How data is stored in Disk.
3. Indexing.
4. Multilevel Indexing.
5. M-way Search Tree
6. B-Tree
7. Insertion/Deleteion B-Tree
8. Bplus Tree

For m-degree there is m-1 key.
In worst case , height of m-way tree = no of keys. As there is no control in key insertion. We can insert as choice.

B-Tree is m-way tree with below restriction
1. m/2 minimum no of child except root.
2. Root minimum 2 children.
3. All leaf at same level
4. Insertion follow Bottom up 

class BTree{
  int deg;
  BTree cp[deg];
  int key[deg-1];
  int ele[deg-1];
}

Bplus Tree
===========
In addition to BTree, non leaf does not contain Record pointer.
Only lead node contain record pointer. There can be duplication of key in leaf and nonleaf node.

Every leaf node is connected to another leaf node as linked list.
Lead node is dense node. Non-leaf node is sparse node.  
Bplus tree is more like database Indexing.

class BplusTree{
  int deg;
  boolean leaf;
  BplusTree cp[deg];
  int key[deg-1];
  int ele[deg-1];
  BplusTree next;
}


