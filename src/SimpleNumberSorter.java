import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		int a=parcelInt(JOptionPane.showInputDialog("Enter the first number"));
		int b=parcelInt(JOptionPane.showInputDialog("Enter the second number"));
		int c=parcelInt(JOptionPane.showInputDialog("Enter the third number"));
		if(a<b && a<c){
			if(b<c){
				JOptionPane.showMessageDialog(null, a+", "+b+", "+c);
			}	
		}else if(a<b && a<c){
			if(b>c){
				JOptionPane.showMessageDialog(null, a+", "+c+", "+b);
				}
			}else if(a>b && a<c){
				if(b<c){
					JOptionPane.showMessageDialog(null, b+", "+a+", "+c);
				}
		}else if(a>b && a>c){
			if(b<c){
				JOptionPane.showMessageDialog(null, b+", "+c+", "+a);
				}
			}else if(a>b && a>c){
				if(b>c){
					JOptionPane.showMessageDialog(null, c+", "+b+", "+a);
				}
				}else if(a<b && a>c){
					if(b>c){
						JOptionPane.showMessageDialog(null, c+", "+a+", "+b);
					}
				}
				}

	private static int parcelInt(String showInputDialog) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
//acb,abc,bac,bca,cba,cab