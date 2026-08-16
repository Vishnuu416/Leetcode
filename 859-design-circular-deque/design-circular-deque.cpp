#define MAX 100
class MyCircularDeque {
    vector<int>deque;
    int front;
    int rear;
    int size;
    int capacity;
public:
    MyCircularDeque(int k) {
        deque.resize(k);
        front =-1;
        rear=-1;
        size=0;
        capacity =k;
        
    }
    
    bool insertFront(int value) {
        if(isFull())
        {
            return false;
        }
        else if(front==-1)
        {
            front = rear =0;
        }
        else if(front ==0)
        {
            front=capacity-1;
        }
        else 
            front--;
        deque[front] = value;
        size++;
        return true;
        

        
    }
    
    bool insertLast(int value) {
        if(isFull())
        {
            return false;
        }
        else if(front==-1)
        {
            front = rear =0;
        }
        else if(rear == capacity-1)
        {
            rear =0;
        }
        else
        {
            rear = (rear+1)%capacity;
        }
            deque[rear]=value;
        
        size++;
        return true;
        

        
    }
    
    bool deleteFront() {
        if(isEmpty())
        {
            return false;
        }
        else if(front==rear)
        {
            front=rear=-1;
        }
        else if(front==capacity-1)
        {
            front =0;
        }
        else
            front = (front+1)%capacity;
        size--;
        return true;
       
        
    }
    
    bool deleteLast() {
        if(isEmpty())
        {
            return false;
        }
        else if(front==rear)
        {
            front=rear=-1;
        }
        else if(rear==0)
        {
            rear = capacity -1;
        }
        else
            rear--;
        size--;
        return true;
        
        
    }
    
    int getFront() {
        if(isEmpty())
        {
            return -1;
        }
        return deque[front];
        
    }
    
    int getRear() {
        if(isEmpty())
        {
            return -1;
        }
        return deque[rear];
        
    }
    
    bool isEmpty() {
        return front==-1;
        
    }
    
    bool isFull() {
        return size==capacity;
    }
};

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque* obj = new MyCircularDeque(k);
 * bool param_1 = obj->insertFront(value);
 * bool param_2 = obj->insertLast(value);
 * bool param_3 = obj->deleteFront();
 * bool param_4 = obj->deleteLast();
 * int param_5 = obj->getFront();
 * int param_6 = obj->getRear();
 * bool param_7 = obj->isEmpty();
 * bool param_8 = obj->isFull();
 */