package fila;

public class FilaInt {
	public final int N = 8;
	int dados[] = new int[N];
	int ini, fim, count;

	public void Init() {
		ini = fim = 0;
		count = 0;
	}

	public boolean IsEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public boolean IsFull() {
		if (count == N)
			return true;
		else
			return false;
	}

	public void Enqueue(int element) {
		if (IsFull()) {
			System.out.println("Stack overflow");
		}else{
			dados[fim] = element;
			fim++;
			count++;
		}
	}

	public void Dequeue() {
		if (IsEmpty()) {
			ini++;
		}
	}

	public void Clean() {
		if (!IsEmpty()) {
			ini = 0;
			fim = 0;
		}
	}

}
