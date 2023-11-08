class ATMStater
{
	public static void main(String[] args)
	{
		String[] branch=new String[5];

		branch[0]="bethur";
		branch[1]="DVG";
		branch[2]="hubli";
		branch[3]="Durga";
		branch[4]="vv puram";

		String[] acs=new String[3];
		acs[0]="LG";
		acs[1]="Philips";
		acs[2]="Sony";

		String[] cctv=new String[5];
		cctv[0]="Sonata";
		cctv[1]="Realme";
		cctv[2]="SinLoe";
		cctv[3]="Hikvision";
		cctv[4]="Samsung";

		ATM atm=new ATM(branch,acs,cctv);
		atm.showInfo();

	}
}