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
import java.util.*;

/**
 *
 * @author Willian Junior <willianjunior.c.f@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex2
 */

public class Ex2 {
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    
        int A, B, C, D;
        
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();
        
        if(B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0)
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
 
    }
 
}
