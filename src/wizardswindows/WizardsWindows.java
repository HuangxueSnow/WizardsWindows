/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizardswindows;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class WizardsWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        for(int l = 0; l < 2; l++){
            int n = reader.nextInt();
            int m = reader.nextInt();
            String tower[][] = new String [m+1][n];
            reader.nextLine();
            String rule1 = reader.nextLine();
            String rule2 = reader.nextLine();
            String rule3 = reader.nextLine();
            String rule4 = reader.nextLine();
            String lastr = reader.nextLine();
            String end = reader.nextLine();
            if(!end.equals("*"))break;
            String[] r1 = rule1.split(" ");
            String[] r2 = rule2.split(" ");
            String[] r3 = rule3.split(" ");
            String[] r4 = rule4.split(" ");
            for(int i = 0; i<n;i++){
                char in;
                in =lastr.charAt(i);
                tower[0][i] = Character.toString(in);
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    String check = "";
                    if(j==0){
                        check += tower[i][n-1];
                        check += tower[i][j+1];
                    }
                    if(j==(n-1)){
                        check += tower[i][j-1];
                        check += tower[i][0];
                    }
                    if(j!=0 && j!=(n-1)){
                        check += tower[i][j-1];
                        check += tower[i][j+1];
                    }
                    if(check.equals(r1[0])){
                        tower[i+1][j] = r1[1];
                    }
                    if(check.equals(r2[0])){
                        tower[i+1][j] = r2[1];
                    }
                    if(check.equals(r3[0])){
                        tower[i+1][j] = r3[1];
                    }
                    if(check.equals(r4[0])){
                        tower[i+1][j] = r4[1];
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(tower[m-1][i]);
            }
            System.out.println();
        }

    }
    
}
