
import java.util.*;
import java.util.function.Consumer;

public class Tree {

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // 1. Реализовать поиск максимального элемента в дереве. Метод назвать findLast
    private Node findLast(Node current) {
        if (root == null || root.right == null) {
            // если узла нет или у него нет правого поддерева, то это последний элемент
            return root;
        }
        // рекурсивно идём вправо до тех пор, пока не найдём последний элемент
        return root;
    }

    // 2.Реализовать подсчет листьев. Листья - это такие узлы дерева, 
    // у которых нет дочерних элементов. Метод назвать getChildrenCount
    public int getChildrenCount(Node current) {
        if (root == null) {
            // если дерево пустое, то количество листьев равно 0
            return 0;
        }
        if (root.left == null && root.right == null) {
            // если у узла нет дочерних элементов, то это лист
            return 1;
        }
        // рекурсивно считаем количество листьев в левом и правом поддереве и складываем их
        return getChildrenCount(root.left) + getChildrenCount(root.right);
    }
    


}
    