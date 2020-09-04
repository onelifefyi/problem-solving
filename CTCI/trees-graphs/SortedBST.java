// Problem: Given sorted array, create BST with minimum height

/*  Approach:
    
- First I thought that the simplest way that I can think of is to take the array's mid as root,
    - then simply insert all (O(N) time) <This doesn't work LOL>

+ Correct: We'll have to divide and conquer each time inserting middle element.
    - Took me a lot of time to implement, gotta practice recursion!!
    
*/

class Node{
    int data;
    Node left;
    Node right;

    Node(int newData){
        data = newData;
    }

    void insert(int newData){
        if(newData<data){
            if(left == null) left = new Node(newData);
            else left.insert(newData);
        }
        else{
            if(right == null) right = new Node(newData);
            else right.insert(newData);
        }
    }

    void printInOrder(){
        if(left != null) left.printInOrder();
        System.out.println(data);
        if(right != null) right.printInOrder();
    }

//  Getting few missing terms
    // public void getMinBST(int left, int right, int[] arr){
    //     if(left >= right){
    //         if(left != (arr.length-1)/2)
    //             insert(arr[left]);
    //         return;
    //     }
    //     else{
    //         getMinBST((left+right)/2+1, right, arr);
    //         getMinBST(left, (left+right)/2, arr);
    //     }
    // }    

// Finally solved
    public static Node getMinBST(int start, int end, int[] arr){
        if(start > end) return null;
        else{
            int mid = (start+end)/2;
            Node newNode = new Node(arr[mid]);
            newNode.left = getMinBST(start, mid-1, arr);
            newNode.right = getMinBST(mid+1, end, arr);
            return newNode;
        }
    }
}

// Incorrect
// class SortedBST{

//     public static Node getMinBST(int[] arr){
//         Node tObj = new Node(arr[arr.length/2]);
//         int left = arr.length/2 - 1;
//         int right = arr.length/2 + 1;
//         while(left >= 0) tObj.insert(arr[left--]);
//         while(right < arr.length) tObj.insert(arr[right++]);
//         return tObj;
//     }

//     public static void main(String[] args){
//         int[] arr = {0, 3, 11, 14, 17, 47, 58, 61, 64, 75};
//         Node minTreObj = getMinBST(arr);
//         minTreObj.printInOrder();
//     }
// }

class SortedBST{

    public static void main(String[] args){
        //int[] arr = {0, 3, 11, 14, 17, 47, 58, 61, 64, 75};
        int[] arr = {1,2,3,4,5,6};
        Node minTreObj = Node.getMinBST(0, arr.length-1, arr);
        //minTreObj.getMinBST(0, arr.length-1, arr);
        minTreObj.printInOrder();
    }
}