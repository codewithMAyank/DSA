class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    def insert(self, data):
        new_node = Node(data)
        if self.root is None:
            self.root = new_node
        else:
            current = self.root
            while True:
                if data < current.data:
                    if current.left is None:
                        current.left = new_node
                        break
                    else:
                        current = current.left
                else:
                    if current.right is None:
                        current.right = new_node
                        break
                    else:
                        current = current.right

    def search(self, data):
        current = self.root
        while current is not None:
            if data == current.data:
                return True
            elif data < current.data:
                current = current.left
            else:
                current = current.right
        return False

    def delete(self, data):
        def find_min_node(node):
            while node.left is not None:
                node = node.left
            return node

        def delete_node(node, data):
            if node is None:
                return node

            if data < node.data:
                node.left = delete_node(node.left, data)
            elif data > node.data:
                node.right = delete_node(node.right, data)
            else:
                if node.left is None:
                    temp = node.right
                    node = None
                    return temp
                elif node.right is None:
                    temp = node.left
                    node = None
                    return temp
                else:
                    temp = find_min_node(node.right)
                    node.data = temp.data
                    node.right = delete_node(node.right, temp.data)

            return node

        self.root = delete_node(self.root, data)

    def inorder_traversal(self):
        def traverse(node):
            if node is None:
                return
            traverse(node.left)
            print(node.data)
            traverse(node.right)

        traverse(self.root)

# example usage
bst = BST()
bst.insert(5)
bst.insert(2)
bst.insert(8)
bst.insert(1)
bst.insert(3)
bst.insert(7)
bst.insert(9)
print("Inorder Traversal:")
bst.inorder_traversal()
print("Searching for 3:", bst.search(3))
bst.delete(3)
print("After deleting 3:")
bst.inorder_traversal()
