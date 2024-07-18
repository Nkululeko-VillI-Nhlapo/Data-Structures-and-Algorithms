// Surname:     Nhlapo
// Name:        Nkululeko
// Student no.: 4129962
// Course:      CSC211 
// Year:        2023 
// Assignment:  Practical 1 Term 2
// File: Playlist 


public class Playlist {
    

    //Attributes
    private Track root; // root of the playlist
    private int size; // number of tracks in the playlist

    //Constructor
    public Playlist() {
        this.root = null;
        this.size = 0;
    }

    //Accessor methods 
    public Track getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    /* mutator methods */
    public void setRoot(Track root) {
        this.root = root;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /* methods */
    public void clear() {
        root = null;
        size = 0;
    }
   
    //searches for a track with the given title in the binary search tree
    public Boolean search(String title) {
        Track current = root;
        while (current != null) { //if the current  track has the same title, we found it
            if (current.getTitle().equals(title)) {
                return true;
            } else if (title.compareTo(current.getTitle()) < 0) { //go left
                current = current.getLeft(); 
            } else {
                current = current.getRight(); //go right
            }
        }
        return false; //if we reach the end of the tree without finding the track, it's not in the tree
        
    }
    //inserts a new track in the binary search tree
    public void insert(String id, String title, String artist, String album, int minutes, int seconds) {
        Track newTrack = new Track( id, title, artist,  album, minutes, seconds);
        if (root == null) {  //if the root is null,set the new track as the root
            root = newTrack;
        } else {    //otherwise traverse the tree to find the correct position
            Track current = root;
            Track parent;
            while (true) {
                parent = current;
                if (title.compareTo(current.getTitle()) < 0) { 
                    //move left if the of the new track is less than the current
                    current = current.getLeft();
                    if (current == null) { //if the left child is null, set the new track as the left child
                        parent.setLeft(newTrack);
                        break;
                    }
                } else { //move to the right child  right if the of the new track is greator or equal to  the current
                    current = current.getRight();
                    if (current == null) { //if the right child is null, set the new track as the right child
                        parent.setRight(newTrack);
                        break;
                    }
                }
            }
        }
        size++; //increament the size of the tree
    }

    public void delete(String title) {
        root = delete(root, title); //delete the root with a given title
    }

    //this method deletes a track with the given title from the binary search tree 
    private Track delete(Track root, String title) {
        if (root == null) {
            return root; //if the track is not found, original tree is returned 
        }

        //this method delets a node with the given title from the BST rooted at root
        if (title.compareTo(root.getTitle()) < 0) {
            root.setLeft(delete(root.getLeft(), title));
        } else if (title.compareTo(root.getTitle()) > 0) {
            root.setRight(delete(root.getRight(), title));
        } else { //if the title matches the root title, return it's right child
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) { //if the root has no right child, return its left child
                return root.getLeft();
            }
            //if the root has both children, replace its title with the minimum value in its right subtree
            root.setTitle(minValue(root.getRight()).getTitle());
            //delete the node with the minimum value in the right subtree
            root.setRight(delete(root.getRight(), root.getTitle()));
        }
        //return the fixed root node
        return root;
    }

    //this method returns the node with the minimum value in the tree
    private Track minValue(Track root) {
        Track current = root;
        while (current.getLeft() != null) { //go through the left subtree until leftmost node is reached
            current = current.getLeft();
        }
        return current; //return the leftmost node, which hasthe minimum value in the tree
    }
    //displays the tracks in inorder traversal
    public void displayInOrder(Track t) {
        if (t != null) {
            displayInOrder(t.getLeft());
            System.out.println(t.toString());
            displayInOrder(t.getRight());
        }
    }

    //calculate the height
    public int height(Track t) {
        if (t == null) { //if the track null, return -1
            return -1;
        }
        //calculating the height of the left and right subtrees
        int leftHeight = height(t.getLeft());
        int rightHeight = height(t.getRight());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

}


