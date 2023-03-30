import java.util.Scanner;
import java.util.InputMismatchException;
public class ProyectoPokimon 
{

	public static void main(String[] args) 
	{Scanner input=new Scanner(System.in);
	//POKEMONS
	String[] namePK={"Venasaur","Charizard","Blastoise","Persian","Arbok","Garchomp","Sandslash","Golem",
			"Cloyster","Togekiss","Alakazam","Gengar","Beedrill","Aerodactyl","Steelix","Machamp","Raichu","Weavile"};
	String[] typePK= {"Planta","Fuego","Agua","Normal","Veneno","Dragon","Tierra","Roca","Hielo","Hada","Psiquico","Fantasma",
			"Bicho","Volador","Acero","Lucha","Electrico","Siniestro"};
	String[] typePKK= {"Planta","Fuego","Agua","Normal","Veneno","Dragon","Tierra","Roca","Hielo","Hada","Psiquico","Fantasma",
		"Bicho","Volador","Acero","Lucha","Electrico","Siniestro"};
	int[] hpPK= {162,158,160,140,134,200,154,162,120,168,127,134,140,162,154,175,134,147};
	int[] hppPK={162,158,160,140,134,200,154,162,120,168,127,134,140,162,154,175,134,147};
	int[] defPK= {189,173,207,136,153,193,175,198,256,217,167,149,169,159,272,159,151,171};
	int[] dmgPK= {198,223,171,150,167,261,182,211,186,225,271,261,169,221,148,234,193,243};
	//ATAQUE RAPIDO
	String[] FAatk= {"Hoja Afilada","Ascuas","Pistola Agua","Arañazo","Acido","Cola Dragon","Disparo Lodo","Lanzarrocas",
			"Vaho Gelido","Encanto","Confusion","Lenguetazo","Picadura","Tajo Aereo","Cola Ferrea","Contrataque","Voltio Cambio","Alarido"};
	int[] dmgFA= {10,7,6,4,6,13,3,11,7,16,16,3,3,9,9,8,12,5};
	int[] engFA= {4,6,4,2,5,9,9,8,5,6,12,3,3,9,6,7,16,13};
	int[] secFA= {2,2,1,1,2,3,2,3,2,3,4,1,1,3,3,2,4,3};
	//ATAQUE CARGADO
	String[] Chatk= {"Planta Feroz","Anillo Igneo","Hidrocañon","Retribuccion","Bomba Acida","Enfado","Terremoto","Roca Afilada",
			"Alud","Brillo Magico","Psicorrayo","Bola Sombra","Tijera X","Pajaro Osado","Cuerpo Pesado","A Bocajarro","Trueno","Juego Sucio"};
	int[] dmgCH= {100,120,80,130,20,110,120,100,90,110,70,100,45,130,70,100,100,70};
	int[] engCH= {45,65,40,70,45,60,65,55,45,70,60,55,35,55,50,45,60,45};
	int select = 0,PK1 = 0,PK2=0,PK3=0,PKM1=0,PKM2=0,PKM3=0,PKact1=0,PKact2=0,cont=0,muerte1=0,muerte2=0,eng1=0,eng2=0,Cargado,camb1,camb2,PKesp1,PKesp2,PKespe1,PKespe2,Rapido,aux1 = 0,aux2,coso=0;
	String ch1,ch2,escu1,escu2; 
	boolean batalla=true,restart;
	do {
		do {restart=false;
		try {
		System.out.println("Seleccione una opcion");
		System.out.println("1.Combate");
		System.out.println("0.Salir");
		select=input.nextInt();
		switch(select) 
		{
		case 1: for(int i=0;i<18;i++) 
		{
			System.out.println("ID:"+i+" Nombre: "+namePK[i]);
			System.out.println("Tipo: "+typePK[i]);
			System.out.println("Puntos de salud: "+hpPK[i]+", Defensa: "+defPK[i]+", Ataque: "+dmgPK[i]);
			System.out.println("Ataque rapido: "+FAatk[i]+", Daño: "+dmgFA[i]+", Energia: +"+engFA[i]+", Tiempo de ataque: "+(0.5*secFA[i])+"Segundos");
			System.out.println("Ataque cargado: "+Chatk[i]+", Daño: "+dmgCH[i]+", Coste de energia: "+engCH[i]);
			System.out.println("");
		}
		do {restart=false;
		do {restart=false;
		try {
		System.out.println("Jugador 1, Seleccione su primer pokemon");
		PK1=input.nextInt();
		if(PK1<0 || PK1>17) {
			System.out.println("Error! Ingrese un numero del 0 al 17");		
			restart=true;}
		}catch(InputMismatchException ex) {System.out.println("Error! ingrese un ID valido");
		input.next();
		restart=true;}
		}while(restart);
		}while(restart);
		do {restart=false;
			try {
		System.out.println("Jugador 1, Seleccione su segundo pokemon");
		PK2=input.nextInt();
		if(PK2==PK1) {System.out.println("Error! Seleccione un pokemon distinto del anterior");
		restart=true;}
		if(PK2<0 || PK2>17) {
			System.out.println("Error! Ingrese un numero del 0 al 17");			
			restart=true;}
		}catch(InputMismatchException ex) {
			System.out.println("Error! Ingrese un ID valido");
			input.next();
			restart=true;}
		}while(restart);
		do {restart=false;
		try {
			System.out.println("Jugador 1, Seleccione su tercer pokemon");
			PK3=input.nextInt();
			if(PK3==PK1 || PK3==PK2) {System.out.println("Error! Seleccione un pokemon distinto de los anteriores");
			restart=true;}
			if(PK3<0 || PK3>17) {
				System.out.println("Error! Ingrese un numero del 0 al 17");			
				restart=true;}
			}catch(InputMismatchException ex) {
				System.out.println("Error! Ingrese un ID valido");
				input.next();
				restart=true;}
		}while(restart);
		do {restart=false;
		try {
			System.out.println("Jugador 2, Seleccione su primer pokemon");
			PKM1=input.nextInt();
			if(PKM1==PK1||PKM1==PK2||PKM1==PK3 ) {System.out.println("Error! Seleccione un pokemon distinto de los del rival");
			restart=true;}
			if(PKM1<0 || PKM1>17) {
				System.out.println("Error! Ingrese un numero del 0 al 17");			
				restart=true;}
			}catch(InputMismatchException ex) {
				System.out.println("Error! Ingrese un ID valido");
				input.next();
				restart=true;}
		}while(restart);
		do{restart=false;
		try {
			System.out.println("Jugador 2, Seleccione su segundo pokemon");
			PKM2=input.nextInt();
			if(PKM2==PK1||PKM2==PK2||PKM2==PK3||PKM2==PKM1) {System.out.println("Error! Seleccione un pokemon distinto de los del rival o los suyos");
			restart=true;}
			if(PKM2<0 || PKM2>17) {
				System.out.println("Error! Ingrese un numero del 0 al 17");			
				restart=true;}
			}catch(InputMismatchException ex) {
				System.out.println("Error! Ingrese un ID valido");
				input.next();
				restart=true;}
		}while(restart);
		do {restart=false;
		try {
			System.out.println("Jugador 2, Seleccione su tercer pokemon");
			PKM3=input.nextInt();
			if(PKM3==PK1||PKM3==PK2||PKM3==PK3||PKM3==PKM1||PKM3==PKM2) {System.out.println("Error! Seleccione un pokemon distinto de los del rival o los suyos");
			restart=true;}
			if(PKM3<0 || PKM3>17) {
				System.out.println("Error! Ingrese un numero del 0 al 17");			
				restart=true;}
			}catch(InputMismatchException ex) {
				System.out.println("Error! Ingrese un ID valido");
				input.next();
				restart=true;}
		}while(restart);
		PKact1=PK1;PKesp1=PK2;PKesp2=PK3;
		PKact2=PKM1;PKespe1=PKM2;PKespe2=PKM3;
		eng1=0;eng2=0;
		int esc1=2,esc2=2;
		while(batalla)
		{ batalla=true;
		
			if(dmgPK[PKact1]>dmgPK[PKact2]) 
			{
				if((cont%secFA[PKact1])==0)
				{
				Rapido = (int)Math.floor(0.5*(dmgPK[PKact1]*1.0/defPK[PKact2])*1.25*debilidad(typePK[PKact1],typePKK[PKact2])*dmgFA[PKact1]*(Math.random()/100*15+0.85))+1;
				hppPK[PKact2]-=Rapido;
				if(hppPK[PKact2]<0) {hppPK[PKact2]=0;}
				System.out.println(namePK[PKact1]+" usa "+FAatk[PKact1]+" y le hace "+Rapido+" de daño a "+namePK[PKact2]+", vida restante "+hppPK[PKact2]);
				eng1+=engFA[PKact1];
				if(hppPK[PKact1]>0) {
					if(eng1>=engCH[PKact1]) {
						do {restart=false;
						try {
						System.out.println("");
						System.out.println(namePK[PKact1]+" puede lanzar "+Chatk[PKact1]+". Desea lanzarlo? SI(S), NO(N)");
						ch1=input.next();
						switch(ch1.toUpperCase()) {
						case "S":eng1-=engCH[PKact1];
						Cargado = (int)Math.floor(0.5*(dmgPK[PKact1]*1.0/defPK[PKact2])*1.25*debilidad(typePK[PKact1],typePKK[PKact2])*dmgCH[PKact1]*(Math.random()/100*15+0.85))+1;
						if(esc2>0) {
							do {restart=false;
							try {
							System.out.println("");
							System.out.println("Jugador 2 Desea activar el escudo? Si(S) No(N), Escudos restantes: "+esc2);
							escu2=input.next();
							switch(escu2.toUpperCase()) {
							case "S":
								esc2-=1;
								break;
							case "N": 
								hppPK[PKact2]-=Cargado;
								if(hppPK[PKact2]<0) {hppPK[PKact2]=0;}
								System.out.println(namePK[PKact1]+" uso "+Chatk[PKact1]+" e hizo un daño de "+Cargado+" a "+namePK[PKact2]+", vida restante: "+hppPK[PKact2]);

								break;
							default:System.out.println("Error!, Ingrese una opcion valida");
							restart=true;
							break;
							}
						}catch(InputMismatchException ex) {System.out.println("Error!, ingrese una opcion valida");
						restart=true;}
						}while(restart);
						}
						
						else {hppPK[PKact2]-=Cargado;
						if(hppPK[PKact2]<0) {hppPK[PKact2]=0;}
						System.out.println(namePK[PKact1]+" uso "+Chatk[PKact1]+" e hizo un daño de "+Cargado+" a "+namePK[PKact2]+", vida restante: "+hppPK[PKact2]);}
						break;
						case "N":
							break;

						default:System.out.println("Error!, Ingrese una opcion valida");
						restart=true;
						break;
						}
						}catch(InputMismatchException ex) {System.out.println("Error!, ingrese una opcion valida");
						restart=true;}
						}while(restart);

					}
				}
				if(hppPK[PKM1]==0 && hppPK[PKM2]==0 && hppPK[PKM3]==0){
					System.out.println("¡¡¡¡EL JUGADOR 1 GANO!!!!");
					batalla=false;
					break;
				}
					
				if(hppPK[PKact2]==0) 
					{	eng2=0;
					do {restart=false;
					try {
					System.out.println("");
					System.out.println(namePK[PKact2]+" a Muerto, seleccione otro pokemon");
					if(hppPK[PKespe1]>0) {System.out.println("1."+namePK[PKespe1]);}else {System.out.println("1."+namePK[PKespe1]+" (Debilitado");}
					if(hppPK[PKespe2]>0) {System.out.println("2."+namePK[PKespe2]);}else {System.out.println("2."+namePK[PKespe2]+" (Debilitado)");}
					muerte2=input.nextInt();
					switch(muerte2) 
					{
					case 1: if(hppPK[PKespe1]==0){System.out.println(namePK[PKespe1]+" Esta debilitado, seleccione otro pokemon");
					restart=true;}
					if(hppPK[PKespe1]>0) {
							aux2=PKact2;
							PKact2=PKespe1;
							PKespe1=aux2;
						System.out.println("Jugador 2 cambio a "+namePK[PKact2]);}
						
					break;
					case 2:if(hppPK[PKespe2]==0){System.out.println(namePK[PKespe2]+" Esta debilitado, seleccione otro pokemon");
					restart=true;}
						if(hppPK[PKespe2]>0) {
							aux2=PKact2;
							PKact2=PKespe2;
							PKespe2=aux2;							
							System.out.println("Jugador 2 cambio a "+namePK[PKact2]);}
					
					break;
					default: System.out.println("Error!, Opcion invalida");
					restart=true;
					break;
					}
					}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
					input.next();
					restart=true;}
					}while(restart);
					}
				if(cont!=0) {
				if((cont%10)==0) 
				{
					if(hppPK[PKesp1]>0 || hppPK[PKesp2]>0) {
						do {restart=false;
						try {
						System.out.println("");
						System.out.println("Jugador 1, Desea cambiar de Pokemon?,");
						if(hppPK[PKesp1]>0) {System.out.println("1."+namePK[PKesp1]);}else {System.out.println("1."+namePK[PKesp1]+" (debilitado)");}
						if(hppPK[PKesp2]>0) {System.out.println("2."+namePK[PKesp2]);}else {System.out.println("2."+namePK[PKesp2]+" (debilitado)");}
						System.out.println("0. Para no realizar cambio");
						camb1=input.nextInt();
						switch(camb1) {
						case 1: if(hppPK[PKesp1]==0) {System.out.println("El pokemon "+namePK[PKesp1]+" esta debilitado");
						restart=true;
						}else if(hppPK[PKesp1]>0) {
								aux1=PKact1;
								PKact1=PKesp1;
								PKesp1=aux1;
								System.out.println("");
								System.out.println("Jugador 1, Saca a "+namePK[PKact1]); }
						break;

						case 2: if(hppPK[PKesp2]==0) {System.out.println("El pokemon "+namePK[PKesp2]+" esta debilitado");
						restart=true;
						}else if(hppPK[PKesp2]>0) {
							aux1=PKact1;
							PKact1=PKesp2;
							PKesp2=aux1;
							System.out.println("");
						System.out.println("Jugador 1, Saca a "+namePK[PKact1]);}
						break;

						case 0:
							break;
						default:System.out.println("Error!,Ingrese una opcion valida");
						restart=true;
						break;
						}
						}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
						input.next();
						restart=true;}
					}while(restart);
					}
					}
				}
				}
				if((cont%secFA[PKact2])==0)
				{
				Rapido = (int)Math.floor(0.5 * (dmgPK[PKact2]*1.0/defPK[PKact1]) * 1.25 *debilidad(typePK[PKact2],typePKK[PKact1])* dmgFA[PKact2] * (Math.random()/100*15+0.85))+1;
				hppPK[PKact1]-=Rapido;
				if(hppPK[PKact1]<0) {hppPK[PKact1]=0;}
				System.out.println(namePK[PKact2]+" usa "+FAatk[PKact2]+" y le hace "+Rapido+" de daño a "+namePK[PKact1]+", vida restante "+hppPK[PKact1]);
				eng2+=engFA[PKact2];
				if(hppPK[PKact1]>0) {
					if(eng2>=engCH[PKact2]) 
					{
						do {restart=false;
						try {
						System.out.println("");
						System.out.println(namePK[PKact2]+" puede lanzar "+Chatk[PKact2]+". Desea lanzarlo? SI(S), NO(N)");
						ch2=input.next();
						switch(ch2.toUpperCase()) {
						case "S":
							eng2-=engCH[PKact2];
							Cargado = (int)Math.floor(0.5 * (dmgPK[PKact2]*1.0/defPK[PKact1]) * 1.25 *debilidad(typePK[PKact2],typePKK[PKact1])* dmgCH[PKact2] * (Math.random()/100*15+0.85))+1;
							if(esc1>0) {System.out.println("");
							do {restart=false;	
							try {
							
							System.out.println("Jugador 1 Desea activar el escudo? Si(S) No(N), Escudos restantes: "+esc1);
								escu1=input.next();
								switch(escu1.toUpperCase()) {
								case "S":
									esc1-=1;
									break;
								case "N": 
									hppPK[PKact1]-=Cargado;
									if(hppPK[PKact1]<0) {hppPK[PKact1]=0;}
									System.out.println(namePK[PKact2]+" uso "+Chatk[PKact2]+" e hizo un daño de "+Cargado+" a "+namePK[PKact1]+", vida restante: "+hppPK[PKact1]);
							break;
							
								default:System.out.println("Error!, Ingrese una opcion valida");
								restart=true;
								break;
								}
							}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
							restart=true;}
							}while(restart);
							}else{hppPK[PKact1]-=Cargado;
							if(hppPK[PKact1]<0) {hppPK[PKact1]=0;}
							System.out.println(namePK[PKact2]+" uso "+Chatk[PKact2]+" e hizo un daño de "+Cargado+" a "+namePK[PKact1]+", vida restante: "+hppPK[PKact1]);}
							break;

						case "N":
							break;

						default:System.out.println("Error!, Ingrese una opcion valida");
						restart=true;
						break;
						}
					}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
					restart=true;}
				}while(restart);
					}
				}
				if(hppPK[PK1]==0 && hppPK[PK2]==0 && hppPK[PK3]==0){
					System.out.println("¡¡¡¡EL JUGADOR 2 GANO!!!!");
					batalla=false;
					break;
				}
				
				if(hppPK[PKact1]==0) 
				{	eng1=0;
				do {restart=false;
				try {
				System.out.println("");
				System.out.println(namePK[PKact1]+" a Muerto, seleccione otro pokemon");
				if(hppPK[PKesp1]>0) {System.out.println("1."+namePK[PKesp1]);}else {System.out.println("1."+namePK[PKesp1]+" (Debilitado)");}
				if(hppPK[PKesp2]>0) {System.out.println("2."+namePK[PKesp2]);}else {System.out.println("2."+namePK[PKesp2]+" (Debilitado)");}
				muerte1=input.nextInt();
				switch(muerte1) 
				{
				case 1: if(hppPK[PKesp1]==0) {System.out.println(namePK[PKesp1]+" Esta debilitado, seleccione otro pokemon");
				restart=true;}
						if(hppPK[PKesp1]>0) {
						aux1=PKact1;
						PKact1=PKesp1;
						PKesp1=aux1;
					System.out.println("Jugador 1 cambio a "+namePK[PKact1]);}
				break;
				case 2:if(hppPK[PKesp2]==0) {System.out.println(namePK[PKesp2]+" Esta debilitado, seleccione otro pokemon");
				restart=true;} 
						if(hppPK[PKesp2]>0) {
					aux1=PKact1;
					PKact1=PKesp2;
					PKesp2=aux1;
				System.out.println("Jugador 1 cambio a "+namePK[PKact1]);}
				
				break;
				default: System.out.println("Error!, Opcion invalida");
				restart=true;
				break;
				}
				}catch(InputMismatchException ex) {System.out.println("Error!, ingrese una opcion valida");
				input.next();
				restart=true;}
				}while(restart);
				}
				if(cont!=0) {
					if((cont%10)==0) 
					{do {restart=false;;
					try {
						if(hppPK[PKespe1]>0 || hppPK[PKespe2]>0) {System.out.println("");
							System.out.println("Jugador 2, Desea cambiar de Pokemon?,");
							if(hppPK[PKespe1]>0) {System.out.println("1."+namePK[PKespe1]);}else {System.out.println("1."+namePK[PKespe1]+" (debilitado)");}
							if(hppPK[PKespe2]>0) {System.out.println("2."+namePK[PKespe2]);}else {System.out.println("2."+namePK[PKespe2]+" (debilitado)");}
							System.out.println("0. Para no realizar cambio");
							camb2=input.nextInt();
							switch(camb2) {
							case 1: if(hppPK[PKespe1]==0){System.out.println("El pokemon "+namePK[PKespe2]+" esta debilitado");
							restart=true;}
									if(hppPK[PKespe1]>0) {
									aux2=PKact2;
									PKact2=PKespe1;
									PKespe1=aux2;
									System.out.println("Jugador 2, Saca a "+namePK[PKact2]); }
							break;

							case 2: if(hppPK[PKespe2]==0){System.out.println("El pokemon "+namePK[PKespe2]+" esta debilitado");
								restart=true;} 
								if(hppPK[PKespe2]>0) {
								aux2=PKact2;
								PKact2=PKespe2;
								PKespe2=aux2;
							System.out.println("Jugador 2, Saca a "+namePK[PKact2]);}
							break;

							case 0:
								break;
							default:System.out.println("Error!,Ingrese una opcion valida");
							restart=true;
							break;
							}
						}
						}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
						input.next();
						restart=true;}
				}while(restart);
				}
					}

				}
			}
			else if(dmgPK[PKact2]>dmgPK[PKact1]) 
			{
				if((cont%secFA[PKact2])==0)
				{
				Rapido = (int)Math.floor(0.5 * (dmgPK[PKact2]*1.0/defPK[PKact1]) * 1.25 *debilidad(typePK[PKact2],typePKK[PKact1])* dmgFA[PKact2] * (Math.random()/100*15+0.85))+1;
				hppPK[PKact1]-=Rapido;
				if(hppPK[PKact1]<0) {hppPK[PKact1]=0;}
				System.out.println(namePK[PKact2]+" usa "+FAatk[PKact2]+" y le hace "+Rapido+" de daño a "+namePK[PKact1]+", vida restante "+hppPK[PKact1]);
				eng2+=engFA[PKact2];
				if(hppPK[PKact1]>0) {
					if(eng2>=engCH[PKact2]) 
					{
						do {restart=false;
						try {
						System.out.println("");
						System.out.println(namePK[PKact2]+" puede lanzar "+Chatk[PKact2]+". Desea lanzarlo? SI(S), NO(N)");
						ch2=input.next();
						switch(ch2.toUpperCase()) {
						case "S":
							eng2-=engCH[PKact2];
							Cargado = (int)Math.floor(0.5 * (dmgPK[PKact2]*1.0/defPK[PKact1]) * 1.25 *debilidad(typePK[PKact2],typePKK[PKact1])* dmgCH[PKact2] * (Math.random()/100*15+0.85))+1;
							if(esc1>0) {System.out.println("");
							do {restart=false;	
							try {
							
							System.out.println("Jugador 1 Desea activar el escudo? Si(S) No(N), Escudos restantes: "+esc1);
								escu1=input.next();
								switch(escu1.toUpperCase()) {
								case "S":
									esc1-=1;
									break;
								case "N": 
									hppPK[PKact1]-=Cargado;
									if(hppPK[PKact1]<0) {hppPK[PKact1]=0;}
									System.out.println(namePK[PKact2]+" uso "+Chatk[PKact2]+" e hizo un daño de "+Cargado+" a "+namePK[PKact1]+", vida restante: "+hppPK[PKact1]);
							break;
							
								default:System.out.println("Error!, Ingrese una opcion valida");
								restart=true;
								break;
								}
							}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
							restart=true;}
							}while(restart);
							}else{hppPK[PKact1]-=Cargado;
							if(hppPK[PKact1]<0) {hppPK[PKact1]=0;}
							System.out.println(namePK[PKact2]+" uso "+Chatk[PKact2]+" e hizo un daño de "+Cargado+" a "+namePK[PKact1]+", vida restante: "+hppPK[PKact1]);}
							break;

						case "N":
							break;

						default:System.out.println("Error!, Ingrese una opcion valida");
						restart=true;
						break;
						}
					}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
					restart=true;}
				}while(restart);
					}
				}
				if(hppPK[PK1]==0 && hppPK[PK2]==0 && hppPK[PK3]==0){
					System.out.println("¡¡¡¡EL JUGADOR 2 GANO!!!!");
					batalla=false;
					break;
				}
				
				if(hppPK[PKact1]==0) 
				{	eng1=0;
				do {restart=false;
				try {
				System.out.println("");
				System.out.println(namePK[PKact1]+" a Muerto, seleccione otro pokemon");
				if(hppPK[PKesp1]>0) {System.out.println("1."+namePK[PKesp1]);}else {System.out.println("1."+namePK[PKesp1]+" (Debilitado)");}
				if(hppPK[PKesp2]>0) {System.out.println("2."+namePK[PKesp2]);}else {System.out.println("2."+namePK[PKesp2]+" (Debilitado)");}
				muerte1=input.nextInt();
				switch(muerte1) 
				{
				case 1: if(hppPK[PKesp1]==0) {System.out.println(namePK[PKesp1]+" Esta debilitado, seleccione otro pokemon");
				restart=true;}
						if(hppPK[PKesp1]>0) {
						aux1=PKact1;
						PKact1=PKesp1;
						PKesp1=aux1;
					System.out.println("Jugador 1 cambio a "+namePK[PKact1]);}
				break;
				case 2:if(hppPK[PKesp2]==0) {System.out.println(namePK[PKesp2]+" Esta debilitado, seleccione otro pokemon");
				restart=true;} 
						if(hppPK[PKesp2]>0) {
					aux1=PKact1;
					PKact1=PKesp2;
					PKesp2=aux1;
				System.out.println("Jugador 1 cambio a "+namePK[PKact1]);}
				
				break;
				default: System.out.println("Error!, Opcion invalida");
				restart=true;
				break;
				}
				}catch(InputMismatchException ex) {System.out.println("Error!, ingrese una opcion valida");
				input.next();
				restart=true;}
				}while(restart);
				}
				if(cont!=0) {
					if((cont%10)==0) 
					{do {restart=false;
					try {
						if(hppPK[PKespe1]>0 || hppPK[PKespe2]>0) {System.out.println("");
							System.out.println("Jugador 2, Desea cambiar de Pokemon?,");
							if(hppPK[PKespe1]>0) {System.out.println("1."+namePK[PKespe1]);}else {System.out.println("1."+namePK[PKespe1]+" (debilitado)");}
							if(hppPK[PKespe2]>0) {System.out.println("2."+namePK[PKespe2]);}else {System.out.println("2."+namePK[PKespe2]+" (debilitado)");}
							System.out.println("0. Para no realizar cambio");
							camb2=input.nextInt();
							switch(camb2) {
							case 1: if(hppPK[PKespe1]==0){System.out.println("El pokemon "+namePK[PKespe1]+" esta debilitado");
							restart=true;}
									if(hppPK[PKespe1]>0) {
									aux2=PKact2;
									PKact2=PKespe1;
									PKespe1=aux2;
									System.out.println("Jugador 2, Saca a "+namePK[PKact2]); }
							break;

							case 2: if(hppPK[PKespe2]==0){System.out.println("El pokemon "+namePK[PKesp2]+" esta debilitado");
								restart=true;} 
								if(hppPK[PKespe2]>0) {
								aux2=PKact2;
								PKact2=PKespe2;
								PKespe2=aux2;
							System.out.println("Jugador 2, Saca a "+namePK[PKact2]);}
							break;

							case 0:
								break;
							default:System.out.println("Error!,Ingrese una opcion valida");
							restart=true;
							break;
							}
						}
						}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
						input.next();
						restart=true;}
				}while(restart);
				}
					}

				}
				if((cont%secFA[PKact1])==0)
				{
				Rapido = (int)Math.floor(0.5*(dmgPK[PKact1]*1.0/defPK[PKact2])*1.25*debilidad(typePK[PKact1],typePKK[PKact2])*dmgFA[PKact1]*(Math.random()/100*15+0.85))+1;
				hppPK[PKact2]-=Rapido;
				if(hppPK[PKact2]<0) {hppPK[PKact2]=0;}
				System.out.println(namePK[PKact1]+" usa "+FAatk[PKact1]+" y le hace "+Rapido+" de daño a "+namePK[PKact2]+", vida restante "+hppPK[PKact2]);
				eng1+=engFA[PKact1];
				if(hppPK[PKact1]>0) {
					if(eng1>=engCH[PKact1]) {
						do {restart=false;
						try {
						System.out.println("");
						System.out.println(namePK[PKact1]+" puede lanzar "+Chatk[PKact1]+". Desea lanzarlo? SI(S), NO(N)");
						ch1=input.next();
						switch(ch1.toUpperCase()) {
						case "S":eng1-=engCH[PKact1];
						Cargado = (int)Math.floor(0.5*(dmgPK[PKact1]*1.0/defPK[PKact2])*1.25*debilidad(typePK[PKact1],typePKK[PKact2])*dmgCH[PKact1]*(Math.random()/100*15+0.85))+1;
						if(esc2>0) {
							do {restart=false;
							try {
							System.out.println("");
							System.out.println("Jugador 2 Desea activar el escudo? Si(S) No(N), Escudos restantes: "+esc2);
							escu2=input.next();
							switch(escu2.toUpperCase()) {
							case "S":
								esc2-=1;
								break;
							case "N": 
								hppPK[PKact2]-=Cargado;
								if(hppPK[PKact2]<0) {hppPK[PKact2]=0;}
								System.out.println(namePK[PKact1]+" uso "+Chatk[PKact1]+" e hizo un daño de "+Cargado+" a "+namePK[PKact2]+", vida restante: "+hppPK[PKact2]);

								break;
							default:System.out.println("Error!, Ingrese una opcion valida");
							restart=true;
							break;
							}
						}catch(InputMismatchException ex) {System.out.println("Error!, ingrese una opcion valida");
						restart=true;}
						}while(restart);
						}
						
						else {hppPK[PKact2]-=Cargado;
						if(hppPK[PKact2]<0) {hppPK[PKact2]=0;}
						System.out.println(namePK[PKact1]+" uso "+Chatk[PKact1]+" e hizo un daño de "+Cargado+" a "+namePK[PKact2]+", vida restante: "+hppPK[PKact2]);}
						break;
						case "N":
							break;

						default:System.out.println("Error!, Ingrese una opcion valida");
						restart=true;
						break;
						}
						}catch(InputMismatchException ex) {System.out.println("Error!, ingrese una opcion valida");
						restart=true;}
						}while(restart);

					}
				}
				if(hppPK[PKM1]==0 && hppPK[PKM2]==0 && hppPK[PKM3]==0){
					System.out.println("¡¡¡¡EL JUGADOR 1 GANO!!!!");
					batalla=false;
					break;
				}
					
				if(hppPK[PKact2]==0) 
					{	eng2=0;
					do {restart=false;
					try {
					System.out.println("");
					System.out.println(namePK[PKact2]+" a Muerto, seleccione otro pokemon");
					if(hppPK[PKespe1]>0) {System.out.println("1."+namePK[PKespe1]);}else {System.out.println("1."+namePK[PKespe1]+" (Debilitado");}
					if(hppPK[PKespe2]>0) {System.out.println("2."+namePK[PKespe2]);}else {System.out.println("2."+namePK[PKespe2]+" (Debilitado)");}
					muerte2=input.nextInt();
					switch(muerte2) 
					{
					case 1: System.out.println("");
						if(hppPK[PKespe1]>0) {
							aux2=PKact2;
							PKact2=PKespe1;
							PKespe1=aux2;
						System.out.println("Jugador 2 cambio a "+namePK[PKact2]);}
						else {System.out.println(namePK[PKespe1]+" Esta debilitado, seleccione otro pokemon");restart=true;}
					break;
					case 2:System.out.println("");
						if(hppPK[PKespe2]>0) {
							aux2=PKact2;
							PKact2=PKespe2;
							PKespe2=aux2;							
							System.out.println("Jugador 2 cambio a "+namePK[PKact2]);}
					else {System.out.println(namePK[PKespe2]+" Esta debilitado, seleccione otro pokemon");
					restart=true;}
					break;
					default: System.out.println("Error!, Opcion invalida");
					restart=true;
					break;
					}
					}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
						input.next();
					restart=true;}
					}while(restart);
					}
				if(cont!=0) {
				if((cont%10)==0) 
				{
					if(hppPK[PKesp1]>0 || hppPK[PKesp2]>0) {
						do {restart=false;
						try {
						System.out.println("");
						System.out.println("Jugador 1, Desea cambiar de Pokemon?,");
						if(hppPK[PKesp1]>0) {System.out.println("1."+namePK[PKesp1]);}else {System.out.println("1."+namePK[PKesp1]+" (debilitado)");}
						if(hppPK[PKesp2]>0) {System.out.println("2."+namePK[PKesp2]);}else {System.out.println("2."+namePK[PKesp2]+" (debilitado)");}
						System.out.println("0. Para no realizar cambio");
						camb1=input.nextInt();
						switch(camb1) {
						case 1: if(hppPK[PKesp1]==0) {System.out.println("El pokemon "+namePK[PKesp1]+" esta debilitado");
						restart=true;
						}else if(hppPK[PKesp1]>0) {
								aux1=PKact1;
								PKact1=PKesp1;
								PKesp1=aux1;
								System.out.println("");
								System.out.println("Jugador 1, Saca a "+namePK[PKact1]); }
						break;

						case 2: if(hppPK[PKesp2]==0) {System.out.println("El pokemon "+namePK[PKesp2]+" esta debilitado");
						restart=true;
						}else if(hppPK[PKesp2]>0) {
							aux1=PKact1;
							PKact1=PKesp2;
							PKesp2=aux1;
							System.out.println("");
						System.out.println("Jugador 1, Saca a "+namePK[PKact1]);}
						break;

						case 0:
							break;
						default:System.out.println("Error!,Ingrese una opcion valida");
						restart=true;
						break;
						}
						}catch(InputMismatchException ex) {System.out.println("Error! Ingrese una opcion valida");
						input.next();
						restart=true;}
					}while(restart);
					}
					}
				}
				}
			}
	cont+=1;
	
		}
		coso+=1;
		if(coso!=0){
			hppPK[PK1]=hpPK[PK1];
			hppPK[PK2]=hpPK[PK2];
			hppPK[PK3]=hpPK[PK3];
			hppPK[PKM1]=hpPK[PKM1];
			hppPK[PKM2]=hpPK[PKM2];
			hppPK[PKM3]=hpPK[PKM3];
			batalla=true;
		}	
		break;
		
		case 0:
			break;
		default: System.out.println("Error!,Ingrese una opcion valida");
		break;
		}
		}catch(InputMismatchException ex) { System.out.println("Error! Ingrese una de las opciones");
		input.next();
		restart=true;
				}
		}while(restart);

	}while(select!=0);

	}
	public static double debilidad(String typePK,String typePKK) {
		double tipoch=0;
		if((typePK.equals("Planta") && (typePKK.equals("Roca") || typePKK.equals("Tierra") || typePKK.equals("Agua"))) || 
				(typePK.equals("Lucha") && (typePKK.equals("Normal") || typePKK.equals("Roca") || typePKK.equals("Acero") || typePKK.equals("Hielo") || typePKK.equals("Siniestro")))|| 
				(typePK.equals("Volador") && (typePKK.equals("Lucha") || typePKK.equals("Bicho") || typePKK.equals("Planta"))) || 
				(typePK.equals("Veneno") && (typePKK.equals("Planta") || typePKK.equals("Hada"))) || 
				(typePK.equals("Tierra") && (typePKK.equals("Veneno") || typePKK.equals("Roca") || typePKK.equals("Acero") || typePKK.equals("Fuego") || typePKK.equals("Electrico")))|| 
				(typePK.equals("Roca") && (typePKK.equals("Volador") || typePKK.equals("Fuego") || typePKK.equals("Bicho") || typePKK.equals("Hielo")))|| 
				(typePK.equals("Bicho") && (typePKK.equals("Planta") || typePKK.equals("Psiquico") || typePKK.equals("Siniestro")))|| 
				(typePK.equals("Fantasma") && (typePKK.equals("Fantasma") || typePKK.equals("Psiquico"))) || 
				(typePK.equals("Acero") && (typePKK.equals("Roca") || typePKK.equals("Hielo") || typePKK.equals("Hada"))) || 
				(typePK.equals("Fuego") && (typePKK.equals("Bicho") || typePKK.equals("Acero") || typePKK.equals("Planta") || typePKK.equals("Hielo"))) || 
				(typePK.equals("Agua") && (typePKK.equals("Tierra") || typePKK.equals("Roca") || typePKK.equals("Fuego") || typePKK.equals("Lucha"))) || 
				(typePK.equals("Electrico") && (typePKK.equals("Volador") || typePKK.equals("Agua"))) || 
				(typePK.equals("Psiquico") && (typePKK.equals("Lucha") || typePKK.equals("Veneno"))) || 
				(typePK.equals("Hielo") && (typePKK.equals("Volador") || typePKK.equals("Tierra") || typePKK.equals("Planta") || typePKK.equals("Dragon"))) || 
				(typePK.equals("Dragon") && typePKK.equals("Dragon"))  || 
				(typePK.equals("Siniestro") && (typePKK.equals("Fantasma") || typePKK.equals("Psiquico"))) ||
				(typePK.equals("Hada") && (typePKK.equals("Lucha") || typePKK.equals("Dragon") || typePKK.equals("Siniestro")))) 
				{tipoch=1.6;}
				
				else if((typePK.equals("Planta") && (typePKK.equals("Volador") || typePKK.equals("Veneno") || typePKK.equals("Bicho") || typePKK.equals("Acero") || typePKK.equals("Fuego") || typePKK.equals("Planta") || typePKK.equals("Dragon"))) || 
						(typePK.equals("Lucha") && (typePKK.equals("Volador") || typePKK.equals("Veneno") || typePKK.equals("Bicho") || typePKK.equals("Psiquico") || typePKK.equals("Hada"))) || 
						(typePK.equals("Volador") && (typePKK.equals("Roca") || typePKK.equals("Acero") || typePKK.equals("Electrico"))) || 
						(typePK.equals("Veneno") && (typePKK.equals("Veneno") || typePKK.equals("Tierra") || typePKK.equals("Roca") || typePKK.equals("Fantasma"))) || 
						(typePK.equals("Tierra") && (typePKK.equals("Planta") || typePKK.equals("Bicho"))) || 
						(typePK.equals("Roca") && (typePKK.equals("Lucha") || typePKK.equals("Tierra") || typePKK.equals("Acero"))) || 
						(typePK.equals("Fantasma") && typePKK.equals("Siniestro")) || 
						(typePK.equals("Acero") && (typePKK.equals("Acero") || typePKK.equals("Fuego") || typePKK.equals("Agua") || typePKK.equals("Electrico"))) || 
						(typePK.equals("Fuego") && (typePKK.equals("Roca") || typePKK.equals("Fuego") || typePKK.equals("Agua") || typePKK.equals("Dragon"))) || 
						(typePK.equals("Agua") && (typePKK.equals("Agua") || typePKK.equals("Planta") || typePKK.equals("Dragon"))) || 
						(typePK.equals("Electrico") && (typePKK.equals("Planta") || typePKK.equals("Electrico") || typePKK.equals("Dragon"))) || 
						(typePK.equals("Psiquico") && (typePKK.equals("Acero") || typePKK.equals("Psiquico"))) || 
						(typePK.equals("Hielo") && (typePKK.equals("Acero") || typePKK.equals("Fuego") || typePKK.equals("Agua") || typePKK.equals("Hielo"))) || 
						(typePK.equals("Dragon") && typePKK.equals("Acero")) || 
						(typePK.equals("Siniestro") && (typePKK.equals("Lucha") || typePKK.equals("Siniestro") || typePKK.equals("Hada"))) || 
						(typePK.equals("Hada") && (typePKK.equals("Veneno") || typePKK.equals("Acero") || typePKK.equals("Fuego"))))
				{tipoch=0.625;}
				
				else if((typePK.equals("Normal") && typePKK.equals("Fantasma")) || 
						(typePK.equals("Lucha") && typePKK.equals("Fantasma")) || 
						(typePK.equals("Veneno") && typePKK.equals("Acero")) || 
						(typePK.equals("Tierra") && typePKK.equals("Volador")) || 
						(typePK.equals("Fantasma") && typePKK.equals("Normal"))  || 
						(typePK.equals("Electrico") && typePKK.equals("Tierra")) || 
						(typePK.equals("Psiquico") && typePKK.equals("Siniestro")) || 
						(typePK.equals("Dragon") && typePKK.equals("Hada"))) 
				{tipoch=0.39;}
				
				else {tipoch=1;}
				return tipoch;
				
	}
}
