// Stack implement using array

#include<iostream>
using namespace std;

#define SIZE 5

int stack[SIZE];
int top = -1;

void push(int val){
    if(top == SIZE-1){
        cout << "Stack overflow" << endl;
    } else {
        stack[++top] = val;
        cout << val << "pushed" << endl;
    }
}

void pop(){
    if(top == -1){
        cout << "Stack underflow" << endl;
    } else {
        cout << stack[top] << "poped" << endl;
        top--;
    }
}

void peek(){
    if(top == -1){
        cout << "stack is empty" << endl;
    } else {
        cout << "Peek element : " << stack[top] << endl;
    }
}

void display(){
    if(top == -1){
        cout << "stack is empty" << endl;
    } else {
        cout << "Stack elements : " << endl;
        for(int i = top; i >= 0; i--){
            cout << stack[i] << " ";
        }
        cout << endl;
    }
}

int main(){
    int choice , value;
    do{
        cout << " 1. Push \n 2. Pop \n 3. Peek \n 4. Display \n 5. Exit" << endl;
        cout << "Enter choice : "; cin >> choice;

        switch(choice){
            case 1:
                cout << "Enter Value : "; cin >> value;
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                cout << "Exiting Program" << endl;
                break;
        }

    } while(choice != 5);

    return 0;
}