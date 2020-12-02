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
    contains(input){
        var runner = this.head
        while(runner.next != null) {
            if (runner.value == input) {
                console.log("True")
                return true
            }
            runner = runner.next
        }
        console.log("false")
        return false
    }
    pop(){
        if(this.head == null) {
            return false
        }
        var runner = this.head
        while(runner.next.next != null) {
            runner = runner.next
        }
        runner.next = null
    }
    remove(value) {
        if(this.head == null) {
            return false
        }
        if (this.head.value == value) {
            this.removeAtFront()
            return
        }
        var runner = this.head
        while(runner.next != null){
            if(runner.next.value == value) {
                runner.next = runner.next.next
                return
            }
        }
        return false
    }
}

var list = new SLL()
list.insertAtFront(1)
list.insertAtFront(2)
list.insertAtFront(3)
list.printValues()
list.contains(4)
list.pop(3)
list.printValues()