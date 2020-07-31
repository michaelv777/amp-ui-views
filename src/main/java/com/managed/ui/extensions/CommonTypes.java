package com.managed.ui.extensions;

public class CommonTypes 
{
	public enum NodeLevel 
	{
		NONE(0),
		CATEGORY(1),
		NODE(2),
		SUBNODE(3);
		
		private int nodelevel = 1;
		
		public int getNodelevel() {
			return nodelevel;
		}


		public void setNodelevel(int nodelevel) {
			this.nodelevel = nodelevel;
		}


		private NodeLevel(int nodelevel) 
		{
			this.nodelevel = nodelevel;
		}
	}
}
