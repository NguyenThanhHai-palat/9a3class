#include <stdio.h>

int main(){
	int code;
    scanf("%d",&code);
	PALATDEV(code);
}

void PALATDEV(int codeexit){
	int size_max = 6;
    if (codeexit !=0){
        if (codeexit == 1){
            return 1;
        }
        if (codeexit == 2){
       		return 2;   
        }
        if (codeexit == 3){
            return 3;
        }
        if (codeexit == 4){
            return 4;
        }
        if (codeexit == 5){
            return 5;
        }
        if (codeexit >= size_max){
           char EXM[] = "Code is out of range";
           printf(EXM);
           return codeexit;
        }

    }
    else {
        return 0;
    }
}
