public class MatrixAdditionAndMultiplicationExample{  
public static void main(String args[]){  
 
int a[][]={{1,3,4},{4,5,6},{2,7,8}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    

int c[][]=new int[3][3];  
 int d[][]=new int[3][3]; 

for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];   
System.out.print(c[i][j]+" ");    
}    
System.out.println();   
}  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
d[i][j]=0;      
for(int k=0;k<3;k++)      
{      
d[i][j]+=a[i][k]*b[k][j];      
} 
System.out.print(d[i][j]+" ");  
} 
System.out.println();   
}    
}}  
