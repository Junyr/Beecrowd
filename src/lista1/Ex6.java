/*
 * Copyright (C) 2024 Willian Junior <willianjunior.c.f@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package lista1;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Willian Junior <willianjunior.c.f@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex6
 */

public class Ex6 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
            int val1, val2, val3;
            
            val1 = ler.nextInt();
            val2 = ler.nextInt();
            val3 = ler.nextInt();
            
            // Primeiro número
            
            if(val1 < val2 && val1 < val3)
            {
                System.out.println(val1);
            }
            else
            {
                if(val2 < val1 && val2 < val3)
                 {
                     System.out.println(val2);
                 }
                 else
                 {
                     if(val3 < val2 && val3 < val1)
                     {
                          System.out.println(val3);
                     }
                 }
            }
            
            // Segundo número
            
            if(val1 > val2 && val1 < val3 || val1 > val3 && val1 < val2)
            {
                System.out.println(val1);
            }
            else
            {
                if(val2 > val1 && val2 < val3 || val2 > val3 && val2 < val1)
                 {
                     System.out.println(val2);
                 }
                 else
                 {
                     if(val3 > val2 && val3 < val1 || val3 > val1 && val3 < val2)
                     {
                          System.out.println(val3);
                     }
                 }
            }
            
            // Terceiro número
            
            if(val1 > val2 && val1 > val3)
            {
                System.out.println(val1);
            }
            else
            {
                if(val2 > val1 && val2 > val3)
                 {
                     System.out.println(val2);
                 }
                 else
                 {
                     if(val3 > val2 && val3 > val1)
                     {
                          System.out.println(val3);
                     }
                 }
            }
            
            // Resultado
            
            System.out.println();
            System.out.println(val1);
            System.out.println(val2);
            System.out.println(val3);
            
    }
}
