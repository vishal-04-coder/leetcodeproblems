#define MAXSIZE 10001
int _index = -1;


bool isEmpty(void){
	if(_index <= MAXSIZE - 1) return true;
	else return false;
}

int numElement(void){
	return _index + 1;
}

void push(char ch, char *stack){
	if(!isEmpty){
	    printf("Stack is full\n");
        return ;
	}
	else{
        _index++;
        stack[_index] = ch;
	}
    printf("push %c to the stack, current _index is %d\n", ch, _index);
}

bool check(char ch, char *stack){
    if(isEmpty() && (ch == '(' || ch == '{' || ch == '[') ){
        push(ch, stack);
        return ;
    }
    if(!numElement()) return false;
    switch(ch){
        case ')' :
            if(stack[_index] == '('){
                pop(stack);
                break;
            }
            else return false;
        break;
        case ']' :
            if(stack[_index] == '['){
                pop(stack);
                break;
            }
            else return false;
        break;
        case '}' :
            if(stack[_index] == '{'){
                pop(stack);
                break;
            }
            else return false;
        break;
    }
    return true;
}

void pop(char *stack){
    if(_index == -1){
		// printf("There is no element in the stack\n");
		return ;
	}
	else{
        _index--;
	}
}

bool isValid(char * s){
    _index = -1;
    char *stack = calloc(MAXSIZE, sizeof(char));
    if(strlen(s) == 1) return false;
    for(int i=0; i<strlen(s); i++){
        if(!check(s[i], stack)){
            _index = -1;
            return false;
        }
	}
    return !numElement();
}