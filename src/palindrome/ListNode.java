/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

class ListNode<AnyType>
{
      // Constructors
    public ListNode( AnyType theElement )
    {
        this( theElement, null );
    }

    public ListNode( AnyType theElement, ListNode<AnyType> n )
    {
        element = theElement;
        next    = n;
    }

    public AnyType   element;
    public ListNode<AnyType> next;
}