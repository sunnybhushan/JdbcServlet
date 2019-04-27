package demo.controller;

import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;

import org.apache.derby.impl.store.access.sort.Scan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			String method="login";
			switch (method) 
			{
			
			case "login":
				System.out.println("login method called 'service.fetchStudent()");
				break;
			
			case "delete":
				System.out.println("login method called 'service.deleteStudent()");
				try 
				{
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
				
			case "update":
				System.out.println("login method called 'service.fetchStudent()");
				break;
			
			case "register":
				System.out.println("login method called 'service.fetchStudent()");
				break;
			
				
			default:
				break;
			}
			
			
			
			
		}
		
		
		
		
	}

