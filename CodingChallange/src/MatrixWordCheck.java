import java.util.Scanner;
public class MatrixWordCheck {
public static void main(String[] args) 
	{
		String str= "app";
		int row,column;
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the string you want to search inside the Matrix");
		str= sc.nextLine();
		
		if(str.equals("")|| (str==null))
		{
		System.out.println("Please enter a valid not null or empty string");
			
		}
		
		else
		{	
		
		System.out.println("Enter number of rows");
		row=sc.nextInt();
		System.out.println("Enter number of columns");
		column=sc.nextInt();
		char[][] arr= new char[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]= sc.next().charAt(0);
			}
		}
		
		
		
		
		System.out.println(str);
		sc.close();
		boolean result=checkStringExists(arr,str);
		if(result==true)
		{
			System.out.println("given string exists");
		}
		else
		{
			System.out.println("given string  does not exists");
		}
		
		}
	}
public static boolean checkStringExists(char[][] arr,String string)
	{
		
	int count=0, length=string.length(), curri,currj, mini,minj,maxi,maxj;
	boolean result=false;
	System.out.println("Inside function");
	
	outerloop:
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
			{
				mini=0;
				maxi=arr.length-1;
				minj=0;
				maxj=arr[i].length-1;
				count=0;
					if(arr[i][j]==string.charAt(0))
					{
						count=0;
						count++;
						curri=i;
						currj=j;
						while(count<string.length())
								{
									int temp=0;
							System.out.println("inside loop searching near " +arr[curri][currj] + " ["+curri+","+currj+"]");
										if(curri==mini)
										{
										//no top search
										System.out.println("Searching inside no top");
										if(currj==minj)
										{
											//no top no left search
											System.out.println("Searching inside no top and left");	
											if(arr[curri][currj+1]==string.charAt(count))//right search
											{
												count++;
												temp++;
												currj=currj+1;
											}
											else if(arr[curri+1][currj]==string.charAt(count))//down search
											{
												count++;
												temp++;
												curri=curri+1;
											}
											}
										else if(currj==maxj)
										{
											//no top no right search
											System.out.println("Searching inside no top and right");	
										if(arr[curri][currj-1]==string.charAt(count))//left search
											{
												count++;
												temp++;
												currj=currj-1;
											}
											else if(arr[curri+1][currj]==string.charAt(count))//down search
											{
												count++;
												temp++;
												curri=curri+1;
											}
											}
										else
										{
											//no top search rest positions
											if(arr[curri][currj+1]==string.charAt(count))//right search
											{									
												System.out.println("Searching inside no top and rest of positions");		
												count++;
												temp++;
												currj=currj+1;
												
											}											
											else if(arr[curri+1][currj]==string.charAt(count))//down search
											{
												count++;
												temp++;
												curri=curri+1;
											}
											 else if(arr[curri][currj-1]==string.charAt(count))//left search
											{
												count++;
												temp++;
												currj=currj-1;										
											}
											}		
										}
										else	if(currj==0)
										{
											//no left search
											System.out.println("Searching inside no  left");	
											if(curri==maxi)
											{											
									//no left down search
									System.out.println("Searching inside no  left and down");	
											if(arr[curri][currj+1]==string.charAt(count))//right search
												{
													count++;
													temp++;
													currj=currj+1;
												}
												else if(arr[curri-1][currj]==string.charAt(count))//up search
												{
													count++;
													temp++;
													curri=curri-1;
												}
												}
											else
											{
												//no left search 
												System.out.println("Searching inside no  left and  searching other elements");
												if(arr[curri][currj+1]==string.charAt(count))//right search
												{
													count++;
													temp++;
													currj=currj+1;
												}
												else if(arr[curri-1][currj]==string.charAt(count))//up search
												{
													count++;
													temp++;
													curri=curri-1;
												}
												else  if(arr[curri+1][currj]==string.charAt(count))//down search
													{
														count++;
														temp++;
														curri=curri+1;
													}
											}
										}
										else if(curri==maxi)
										{
											// no down search
											System.out.println("Searching inside no  down");
												if(currj==0)
												{
													System.out.println("Searching inside last row no down and left ");
													//no left down search
													if(arr[curri][currj+1]==string.charAt(count))//right search
													{
														count++;
														temp++;
														currj=currj+1;
													}
											else if(arr[curri-1][currj]==string.charAt(count))//up search
													{
														count++;
														temp++;
														curri=curri-1;
													}
													}
												if(currj==maxj)
												{
													//no right down search
													System.out.println("Searching inside last row no down and right  ");
													if(arr[curri-1][currj]==string.charAt(count))//up search
													{
														count++;
														temp++;
														curri=curri-1;
													}
													else if(arr[curri][currj-1]==string.charAt(count))//left search
														{
															count++;
															temp++;
															currj=currj-1;
															}
													}
														else
												{
													//no down search
												System.out.println("Searching inside last row no down but rest of positions ");
											if(arr[curri][currj+1]==string.charAt(count))//right search
													{
														count++;
														temp++;
														currj=currj+1;
														}
												else	if(arr[curri-1][currj]==string.charAt(count))//up search
													{
														count++;
														temp++;
														curri=curri-1;
														}
													else if(arr[curri][currj-1]==string.charAt(count))//left search
														{
															count++;
															temp++;
															currj=currj-1;
														}
													}
												}
										else if(currj==maxj)
										{
											// no right 
											System.out.println("Searching inside  no right   ");
											if(curri==0)
											{
												//no top right search
												System.out.println("Searching inside  no right  no top   ");
											if(arr[curri+1][currj]==string.charAt(count))//down search
													{
														count++;
														temp++;
														curri=curri+1;
													}
												 else if(arr[curri][currj-1]==string.charAt(count))//left search
													{
														count++;
														temp++;
														currj=currj-1;
													}
											}
											else
											{
												// no right 
												System.out.println("Searching inside  no right  but rest elements  ");
												if(arr[curri-1][currj]==string.charAt(count))//up search
												{
													count++;
													temp++;
													curri=curri-1;
													}
												else if(arr[curri+1][currj]==string.charAt(count))//down search
													{
														count++;
														temp++;
														curri=curri+1;
													}
												else if(arr[curri][currj-1]==string.charAt(count))//left search
													{
														count++;
														temp++;
														currj=currj-1;
													}
													}
											}
										else
										{
											//search everything 
											System.out.println("Searching everything   ");
											if(arr[curri][currj+1]==string.charAt(count))//right search
											{
												count++;
												temp++;
												currj=currj+1;
											}
											else if(arr[curri-1][currj]==string.charAt(count))//up search
											{
												count++;
												temp++;
												curri=curri-1;
											}
											else if(arr[curri+1][currj]==string.charAt(count))//down search
												{
													count++;
													temp++;
													curri=curri+1;
												}
											 else if(arr[curri][currj-1]==string.charAt(count))//left search
												{
													count++;
													temp++;
													currj=currj-1;
												}
												}
											if(temp==0 )
										{
											break;
										}
										else if(count==length)
										{
										result=true;
											break outerloop;
										}
							}		
						}
					}
		}		
	if(result==true)
	{
		return true;
	}
	else 
	{
		return false;
	}
	}
	}