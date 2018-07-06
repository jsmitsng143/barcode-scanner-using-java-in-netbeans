/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;







/**
 *
 * @author HIMANSHU
 */
public class Fram1 extends javax.swing.JFrame {

    private final int A[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255,255,255,255,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int B[]={255,0,0,255,255,0,0,0,0,0,0,1,255,254,255,0,1,255,255,255,255,253,255,0,0,255,254,255,0,0,0,0,0,0,1,254};
    private final int C[]={255,0,0,0,1,0,1,0,255,255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,255,255,255,255,0,0,255,255,255,0,0,255};
    private final int D[]={255,0,0,255,254,255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,255,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int E[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,0,0,0,0,0,255,255,255,255,255,255,0,0,255,254,255,0,0,255};
    private final int F[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,0,0,0,0,0,0,0,255,255,255,255,255,255,0,0,255,255,255,0,0,255};
    private final int G[]={255,0,0,255,254,255,0,0,255,255,0,0,255,255,255,255,255,255,0,0,0,0,0,0,0,255,254,255,0,0,0,0,0,0,1,254};
    private final int H[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255,253,255,255,254,255,0,0,0,0,0,0,0,255,254,255,0,0,255};
    private final int I[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,0,0,255,255,255,255,255,255,0,0,0,0,0,0,0,255,255,255,0,0,255};
    private final int J[]={255,0,0,255,254,255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,255,255,255,255,0,0,0,0,0,0,255,255,255,0,0,255};
    private final int K[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255,255,0,0,255,255,255,255,255,255,255,0,0,0,0,0,0,1,254};
    private final int L[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,0,0,255,254,255,0,0,255,255,255,255,255,255,255,0,0,0,0,0,0,1,254};
    private final int M[]={255,0,0,0,0,0,0,0,255,255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255,255,255,255,255,255,255,0,0,255};
    private final int N[]={255,0,0,255,254,255,0,0,255,255,0,0,0,0,0,0,0,255,255,0,0,255,254,255,255,255,255,255,0,0,0,0,0,0,1,254};
    private final int O[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,0,0,255,255,255,255,255,255,255,0,0,255};
    private final int P[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,0,1,0,0,0,1,0,255,254,255,0,0,255,255,255,255,255,255,255,0,0,255};
    private final int Q[]={255,0,0,255,254,255,0,0,255,255,0,0,255,255,0,1,0,1,0,0,0,255,255,255,255,255,255,255,0,0,0,0,0,0,1,254};
    private final int R[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255,255,0,1,0,0,0,0,0,255,255,255,255,255,255,255,0,0,255};
    private final int S[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,0,0,255,255,254,1,0,0,0,0,0,0,255,255,255,255,255,255,255,0,0,255};
    private final int T[]={255,0,0,255,254,255,0,0,255,255,0,0,0,0,0,0,0,255,255,0,1,0,0,0,0,0,255,255,255,255,255,255,255,0,0,255};
    private final int U[]={255,0,0,0,0,0,0,0,255,255,255,255,255,255,0,0,255,254,255,0,0,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int V[]={255,0,0,255,254,255,255,255,255,255,0,0,0,0,0,1,0,255,255,0,0,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int W[]={255,0,0,0,0,0,0,0,255,255,255,255,255,255,0,0,0,0,0,0,1,253,255,255,0,0,255,255,0,0,255,255,255,0,0,255};
    private final int X[]={255,0,0,255,254,255,255,255,255,255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int Y[]={255,0,0,0,0,0,0,0,255,255,255,255,255,255,255,0,0,255,255,0,1,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255};
    private final int Z[]={255,0,0,255,254,255,255,255,255,255,0,0,0,0,0,0,0,255,255,0,1,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255};
    
    private final int N0[]={255,0,0,255,254,255,255,255,255,255,0,0,0,0,0,0,0,255,255,0,1,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255};
    private final int N1[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,255,255,254,255,0,0,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int N2[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,255,255,254,255,0,0,255,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int N3[]={255,0,0,0,1,0,1,0,255,255,0,0,0,0,0,0,0,255,255,255,254,255,254,255,0,0,255,255,0,0,255,255,255,0,0,255};
    private final int N4[]={255,0,0,255,254,255,0,0,255,255,255,255,255,255,0,0,0,0,0,0,1,253,255,255,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int N5[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,255,255,255,254,1,0,0,0,0,0,0,255,255,0,0,255,254,255,0,0,255};
    private final int N6[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,255,255,255,254,1,0,0,0,0,0,0,255,255,0,0,255,255,255,0,0,255};
    private final int N7[]={255,0,0,255,254,255,0,0,255,255,255,255,255,255,0,0,255,255,254,0,0,0,0,0,0,0,255,255,0,0,0,0,0,0,1,254};
    private final int N8[]={255,0,0,0,0,0,0,0,255,255,0,0,255,255,255,255,255,254,255,0,0,255,255,0,0,0,0,0,0,0,255,255,255,0,0,255};
    private final int N9[]={255,0,0,255,255,0,0,0,0,0,0,0,255,255,254,255,255,254,255,0,0,255,255,0,0,0,0,0,0,0,255,254,255,0,0,255};
    
    
    
    
    
    int Big[];
    String str=" ";
    int pattern[];
    
BufferedImage image,BWI;
    int width,BW; 
    int height,BH;
    public String msg;
    File FI;
    
    int count = 0;
    int pixel[];
    
    double avg;
    
    public Fram1() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("C H E C K");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barcode/barcode/image/007.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");

        jButton2.setText("C R E A T E ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(236, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

  try {
            File input = new File("C:\\Users\\HIMANSHU\\Desktop\\BARCODES FONT\\AQ.jpg"); 
            image = ImageIO.read(input); 
            width = image.getWidth(); 
            height = image.getHeight();           
        
          Big = new int[width];
            pattern = new int[36];
                
             
             for(int i=0; i<height; i++)
            {
                for(int j=0; j<width; j++)
                { 
                    
                    if(i==(height/2))
                    {
                     Color c = new Color(image.getRGB(j, i));                 
                     Big[j]=c.getRed();                                                      
                    }                                   
                }               
            } 
     
             

             
         
         for(int i1=0;i1<Big.length;i1+=36)
         {
             
         int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
        
      for(int j1=0; j1<36; j1++)
            { 
             pattern[j1]=Big[j1+i1]; 
             
             
             
            }
        
      
        
        
        
        
        
        
      
        for(int j1=0; j1<36; j1++)
            {             
            if((A[j1]==pattern[j1])|| (A[j1]-1==pattern[j1]) || (A[j1]==pattern[j1]-1)  || (A[j1]==pattern[j1]-2) || (A[j1]-1==pattern[j1]))
            a++;               
            else
            break;                                         
            }            
        if(a==36)
          str+="A";
        
        if(a==36)
           continue;
   
        
        
        
        
        
        
        
        
        for(int j1=0; j1<36; j1++)
            {  
                if(  (B[j1]==pattern[j1])  ||   ((B[j1]-1)==pattern[j1])  ||  (B[j1]==(pattern[j1]-1))|| (B[j1]==pattern[j1]-2) || (B[j1]-1==pattern[j1])   )                     
                         b++;                        
                         else
                       break;
             }           
        if(b==36)
          str+="B";
        if(b==36)
           continue;
           
        
     
        
        for(int j1=0; j1<36; j1++)
            { 
                 if(  (C[j1]==pattern[j1])  ||   ((C[j1]-1)==pattern[j1])  ||  (C[j1]==(pattern[j1]-1)) || (C[j1]==pattern[j1]-2) || (C[j1]-1==pattern[j1])  )                     
                         c++;
                     else
                       break;
                      } 
     if(c==36)
          str+="C";
     if(c==36)
           continue;
        
        
                  
                
       
     
      for(int j1=0; j1<36; j1++)
            {             
            if((D[j1]==pattern[j1])|| (D[j1]-1==pattern[j1]) || (D[j1]==pattern[j1]-1)  || (D[j1]==pattern[j1]-2) || (D[j1]-1==pattern[j1]))
            d++;               
            else
            break;                                         
            }            
        if(d==36)
          str+="D";
        
        if(d==36)
           continue;
   
        
        
        
       
         for(int j1=0; j1<36; j1++)
            {             
            if((E[j1]==pattern[j1])|| (E[j1]-1==pattern[j1]) || (E[j1]==pattern[j1]-1)  || (E[j1]==pattern[j1]-2) || (E[j1]-1==pattern[j1]))
            e++;               
            else
            break;                                         
            }            
        if(e==36)
          str+="E";
        
    
   
        
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((F[j1]==pattern[j1])|| (F[j1]-1==pattern[j1]) || (F[j1]==pattern[j1]-1)  || (F[j1]==pattern[j1]-2) || (F[j1]-1==pattern[j1]))
            f++;               
            else
            break;                                         
            }            
        if(f==36)
          str+="F";
        
        if(f==36)
           continue;
   
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((G[j1]==pattern[j1])|| (G[j1]-1==pattern[j1]) || (G[j1]==pattern[j1]-1)  || (G[j1]==pattern[j1]-2) || (G[j1]-1==pattern[j1]))
            g++;               
            else
            break;                                         
            }            
        if(g==36)
          str+="G";
        
        if(g==36)
           continue;
   
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((H[j1]==pattern[j1])|| (H[j1]-1==pattern[j1]) || (H[j1]==pattern[j1]-1)  || (H[j1]==pattern[j1]-2) || (H[j1]-1==pattern[j1]))
            h++;               
            else
            break;                                         
            }            
        if(h==36)
          str+="H";
        
        if(h==36)
           continue;
   
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((I[j1]==pattern[j1])|| (I[j1]-1==pattern[j1]) || (I[j1]==pattern[j1]-1)  || (I[j1]==pattern[j1]-2) || (I[j1]-1==pattern[j1]))
            i++;               
            else
            break;                                         
            }            
        if(i==36)
          str+="I";
        
        if(i==36)
           continue;
   
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((J[j1]==pattern[j1])|| (J[j1]-1==pattern[j1]) || (J[j1]==pattern[j1]-1)  || (J[j1]==pattern[j1]-2) || (J[j1]-1==pattern[j1]))
            j++;               
            else
            break;                                         
            }            
        if(j==36)
          str+="J";
        
        if(j==36)
           continue;
   
        
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((K[j1]==pattern[j1])|| (K[j1]-1==pattern[j1]) || (K[j1]==pattern[j1]-1)  || (K[j1]==pattern[j1]-2) || (K[j1]-1==pattern[j1]))
            k++;               
            else
            break;                                         
            }            
        if(k==36)
          str+="K";
        
        if(k==36)
           continue;
   
        
        
        
        
        
        
     for(int j1=0; j1<36; j1++)
            {             
            if((L[j1]==pattern[j1])|| (L[j1]-1==pattern[j1]) || (L[j1]==pattern[j1]-1)  || (L[j1]==pattern[j1]-2) || (L[j1]-1==pattern[j1]))
            l++;               
            else
            break;                                         
            }            
        if(l==36)
          str+="L";
        
        if(l==36)
           continue;
   
        
        
        
        
            
         for(int j1=0; j1<36; j1++)
            {        
                
            if((M[j1]==pattern[j1])|| (M[j1]-1==pattern[j1]) || (M[j1]==pattern[j1]-1)  || (M[j1]==pattern[j1]-2) || (M[j1]-1==pattern[j1]))
            m++;                                        
            else
            break;                                         
            }            
        if(m==36)
          str+="M";
        
        if(m==36)
           continue;
   
        
        
        
        
       for(int j1=0; j1<36; j1++)
            {             
            if((N[j1]==pattern[j1])|| (N[j1]-1==pattern[j1]) || (N[j1]==pattern[j1]-1)  || (N[j1]==pattern[j1]-2) || (N[j1]-1==pattern[j1]))
            n++;               
            else
            break;                                         
            }            
        if(n==36)
          str+="N";
        
        if(n==36)
           continue;
   
        
        
        
        
          
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((O[j1]==pattern[j1])|| (O[j1]-1==pattern[j1]) || (O[j1]==pattern[j1]-1)  || (O[j1]==pattern[j1]-2) || (O[j1]-1==pattern[j1]))
            o++;               
            else
            break;                                         
            }            
        if(o==36)
          str+="O";
        
        if(o==36)
           continue;
   
        
        
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((P[j1]==pattern[j1])|| (P[j1]-1==pattern[j1]) || (P[j1]==pattern[j1]-1)  || (P[j1]==pattern[j1]-2) || (P[j1]-1==pattern[j1]))
            p++;               
            else
            break;                                         
            }            
        if(p==36)
          str+="P";
        
         if(p==36)
           continue; 
         
         
    
   
        
        
        
         for(int j1=0; j1<36; j1++)
            {             
            if((Q[j1]==pattern[j1])|| (Q[j1]-1==pattern[j1]) || (Q[j1]==pattern[j1]-1)  || (Q[j1]==pattern[j1]-2) || (Q[j1]-1==pattern[j1]))
            q++;               
            else
            break;                                         
            }            
        if(q==36)
          str+="Q";
        
         if(q==36)
           continue; 
        
        
        
        
  for(int j1=0; j1<36; j1++)
            {             
            if((R[j1]==pattern[j1])|| (R[j1]-1==pattern[j1]) || (R[j1]==pattern[j1]-1)  || (R[j1]==pattern[j1]-2) || (R[j1]-1==pattern[j1]))
            r++;               
            else
            break;                                         
            }            
        if(r==36)
          str+="R";
        
         if(r==36)
           continue; 

         
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((S[j1]==pattern[j1])|| (S[j1]-1==pattern[j1]) || (S[j1]==pattern[j1]-1)  || (S[j1]==pattern[j1]-2) || (S[j1]-1==pattern[j1]))
            s++;               
            else
            break;                                         
            }            
        if(s==36)
          str+="S";
        
         if(s==36)
           continue; 
         
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((T[j1]==pattern[j1])|| (T[j1]-1==pattern[j1]) || (T[j1]==pattern[j1]-1)  || (T[j1]==pattern[j1]-2) || (T[j1]-1==pattern[j1]))
            t++;               
            else
            break;                                         
            }            
        if(t==36)
          str+="T";
        
         if(t==36)
           continue; 
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((U[j1]==pattern[j1])|| (U[j1]-1==pattern[j1]) || (U[j1]==pattern[j1]-1)  || (U[j1]==pattern[j1]-2) || (U[j1]-1==pattern[j1]))
            u++;               
            else
            break;                                         
            }            
        if(u==36)
          str+="U";
        
         if(u==36)
           continue; 
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((V[j1]==pattern[j1])|| (V[j1]-1==pattern[j1]) || (V[j1]==pattern[j1]-1)  || (V[j1]==pattern[j1]-2) || (V[j1]-1==pattern[j1]))
            v++;               
            else
            break;                                         
            }            
        if(v==36)
          str+="V";
        
         if(v==36)
           continue; 
         
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((W[j1]==pattern[j1])|| (W[j1]-1==pattern[j1]) || (W[j1]==pattern[j1]-1)  || (W[j1]==pattern[j1]-2) || (W[j1]-1==pattern[j1]))
            w++;               
            else
            break;                                         
            }            
        if(w==36)
          str+="W";
        
         if(w==36)
           continue; 
         
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((X[j1]==pattern[j1])|| (X[j1]-1==pattern[j1]) || (X[j1]==pattern[j1]-1)  || (X[j1]==pattern[j1]-2) || (X[j1]-1==pattern[j1]))
            x++;               
            else
            break;                                         
            }            
        if(x==36)
          str+="X";
        
         if(x==36)
           continue; 
         
         
         
         
         
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((Y[j1]==pattern[j1])|| (Y[j1]-1==pattern[j1]) || (Y[j1]==pattern[j1]-1)  || (Y[j1]==pattern[j1]-2) || (Y[j1]-1==pattern[j1]))
            y++;               
            else
            break;                                         
            }            
        if(y==36)
          str+="Y";
        
         if(y==36)
           continue; 
         
         
         
         
         
         
          for(int j1=0; j1<36; j1++)
            {             
            if((Z[j1]==pattern[j1])|| (Z[j1]-1==pattern[j1]) || (Z[j1]==pattern[j1]-1)  || (Z[j1]==pattern[j1]-2) || (Z[j1]-1==pattern[j1]))
            z++;               
            else
            break;                                         
            }            
        if(z==36)
          str+="Z";
        
         
         
         }
         
         
         
      }
  
        catch (Exception e) 
        {
        jTextArea1.setText(e.toString());
        } 
  
  
  jTextArea1.append("\n"+str);
          
   ImageIcon I1 = new ImageIcon(image);
                    
                    jLabel1.setIcon(I1);
                               
                 
  
 
  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
      try {
            FI = new File("C:\\Users\\HIMANSHU\\Desktop\\007.jpg"); 
            BWI = ImageIO.read(FI); 
            BW = BWI.getWidth(); 
            BH = BWI.getHeight(); 
                     
            for(int i=0; i<BH; i++)
            { 
                jTextArea1.append(String.valueOf(count +"    "));
                for(int j=0; j<BW; j++)
                { 
                    Color c = new Color(BWI.getRGB(j, i));                    
                   double r = Math.sqrt((c.getRed()^2));
                   double g = (c.getGreen()^2);
                   double b = (c.getBlue()^2); 
                   avg = (r+g+b)/3;
                   
                   Color NewC = new Color((int)avg, (int)avg, (int)avg);
                                             
                   BWI.setRGB(j, i, NewC.getRGB());
                   jTextArea1.append(String.valueOf(avg +"   "));
                }
                jTextArea1.append(String.valueOf("\n"));
                count++;
            }
            
            FI = new File("C:\\Users\\HIMANSHU\\Desktop\\008.jpg");
             ImageIO.write(BWI, "jpg", FI);             
             ImageIcon Ic = new ImageIcon(BWI);            
                   
             jLabel1.setIcon(Ic);
      } 
        
        catch (IOException e) {}          
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fram1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
