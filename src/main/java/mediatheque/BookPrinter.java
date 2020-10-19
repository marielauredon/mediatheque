/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author marie
 */
public class BookPrinter implements ItemVisitor{
    
        public void visit(Book book){
            System.out.println(book.toString());
        }
        
        public void visit(CD cd){
        }
    }

