package main.java;public final class Item {        private int key;        //constructor        public Item(int keyValue) {                 setKey(keyValue);        }                // further components and methods                /**         * Returns the key value for item.         * @return         */		public int getKey() {			return key;		}				/**		 * Sets the key value for item.		 * @param key		 */		public void setKey(int key) {			this.key = key;		}}