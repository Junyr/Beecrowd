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
 * @brief Class Ex9
 */

public class Ex9 {
    public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int a, b, resul, ti;
		
		ti = ler.nextInt();
		
		if(ti > 0 && ti <= 20)
		{
			for(;ti >= 1; ti--)
			{
				a = ler.nextInt();
				resul = 0;
				
				if(a > 0 && a <= 1000000000)
				{
					for(b = a / 2; b > 0; b--)
					{
						if(a % b == 0)
						{
							resul = resul + b;
						}
					}
						if(resul == a)
						{
							System.out.println(a + " eh perfeito");
						} else { if(resul != a)
							System.out.println(a + " nao eh perfeito");
						}
				}
				
			}
		}
	}
}
