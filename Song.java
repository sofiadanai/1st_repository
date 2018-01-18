// � ����������� ������� ��� ������� 4,���� ���� �� ����� �����������

public class Song{
/*����� ��� ���������� ������������ ���� �������� ������������
	 ��� ��n �����, ��� ����������� ��� ��� �� url ���
	 */
	private String title;
	private Singer singer;
	private String url;
	static int counter=0;
	private int id;
/*O ������������� ����������� ����� ���������� ��������� ���� ��� ���������� ������������
	*��� � ������ ��� song ������ �� ����� ��� ������ ������������ ����������� song.
	��� ���������� ���� ��� title ������ (�� �������� �� ��� ������������ ��� ������ Singer)
  */
  public Song(String title, Singer singer,String url){
        this.title= title;
		this.singer= singer;
		this.url= url;
		this.id = ++counter;
	}

	public String get�itle(){
		return title;
	}

	public void set�itle(String title){
	   this.title= title;
	}

	public Singer getSinger(){
		return singer;
	}

	public void setSinger(Singer singer){
		this.singer= singer;
	}

	public String getUrl(){
			return url;
	}

	public void setUrl(String url){
		   this.url= url;
	}
/* ����������� ������������*/
		public String toString(){
			return "Singer[ title=" +title +",singer="+ singer +",url=" +url +"]";
		}

}
