/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Michael
 */
public class Tree<E> {

    private TreeNode<E> root;

    public Tree() {
        this.root = new TreeNode<>(null); // O proporciona un contenido inicial si es necesario
    }

    public Tree(E content) {
        this.root = new TreeNode<>(content);
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public E getRoot() {
        return root.getContent();
    }

    private TreeNode<E> getRootNode() {
        return this.root;
    }

    private void setRootNode(TreeNode<E> root) {
        this.root = root;
    }

    public void setRoot(E content) {
        this.root.setContent(content);
    }

    public boolean isLeaf() {
        return this.root.getChildren().isEmpty();
    }

}
