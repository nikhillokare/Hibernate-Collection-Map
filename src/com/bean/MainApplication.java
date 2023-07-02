package com.bean;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainApplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Session s = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction t= s.beginTransaction();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Enter Team Count");
		int tno = Integer.parseInt(br.readLine());
		
		//teamCount
		
		for(int j=0;j<tno;j++)
		{
			System.out.println("Enter team Details:\n Team_Name,Owner_Name");
			String tn = br.readLine();
			String on  =br.readLine();
			
			System.out.println("Enter Team Count");
			int pn = Integer.parseInt(br.readLine());
			
			Map<String,Player>m=new HashMap<>();
			
			for(int k=0;k<pn;k++)
			{
				System.out.println("Enter Player Details:\nName,JerseyNumber, Cost, CountryName");
				String n= br.readLine();
				int jno = Integer.parseInt(br.readLine());
				float c = Float.parseFloat(br.readLine());
				String cn  =br.readLine();
				
				Player p = new Player();
				p.setJno(jno);
				p.setPlayer_name(n);
				p.setPlayer_sold_value(c);
				
				m.put(cn, p);	
			}
			//Player for Loop
			
			IPLTeam ipl = new IPLTeam();
			ipl.setTeam_name(tn);
			ipl.setOwner_name(on);
			ipl.setPlayers(m);
		   	s.save(ipl);
		}
		
             t.commit();		

	}

}
