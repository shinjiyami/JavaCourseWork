class Node{
    constructor(value){
        this.value = value
        this.next = null
    }
}

class SLL{
    constructor(){
        this.head = null
    }
    insertAtFront(value){
        if(this.head == null){
            var newNode = new Node(value)
            newNode.next = this.head
            this.head = newNode
        }
        else{
            var newNode = new Node(value)
            newNode.next = this.head
            this.head = newNode
        }
    }
    removeAtFront(){
        if(this.head == null){
            console.log("list is empty")
        }
        else{
            var value = this.head.value
            this.head = this.head.next
            return value
        }
    }
    printValues(){
        var runner = this.head
        while(runner.next != null) {
            console.log(runner.value)
            runner = runner.next
        }
        console.log(runner.value)
    }
}

var list = new SLL()
list.insertAtFront(1)
list.insertAtFront(2)
list.insertAtFront(3)