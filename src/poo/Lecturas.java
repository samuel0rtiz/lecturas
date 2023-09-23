/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sortiz
 */
public class Lecturas
{

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static int LeerEntero()
    {
        try
        {
            return Integer.parseInt(br.readLine());
        } catch (IOException ex)
        {
            //Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se encontro el periferico de entrada");
            return 0;
        } catch (NumberFormatException Error)
        {
            System.out.println("Se esperaba un entero");
            return 0;

        } catch (Exception Error)
        {
            System.out.println("error" + Error);
            return 0;
        }
    }

    public static int LeerEntero(boolean b)
    {
        do
        {
            try
            {
                return Integer.parseInt(br.readLine());
            } catch (Exception Error)
            {
                System.out.println("error" + Error);
                System.out.println("Vuelve a intentarlo...");

            }
        } while (b);
        return 0;

    }

    public static double Leerdouble()
    {
        try
        {
            return Double.parseDouble(br.readLine());
        } catch (IOException ex)
        {
            //Logger.getLogger(Lecturas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se encontro el periferico de entrada");
            return 0;
        } catch (NumberFormatException Error)
        {
            System.out.println("Se esperaba un double");
            return 0;

        } catch (Exception Error)
        {
            System.out.println("error" + Error);
            return 0;
        }
    }

    public static char LeerCaracter()
    {
        char c = ' ';
        try
        {
            c = (char) br.read();
            String s = br.readLine();

        } catch (Exception e)
        {
            System.out.println("error..." + e);
        }
        return c;

    }

    public static String LeerCadena()
    {
        String s = " ";
        try
        {
            s = br.readLine();

        } catch (Exception e)
        {
            System.out.println("error..." + e);
        }
        return s;

    }

}
