import lib.Input;

public class Notebk {

	public static void main(String[] args) {
		//operationクラスをインスタンス
		operation op = new operation();

		System.out.println("お小遣い帳");
		//お小遣い帳部分
		while(true){
			System.out.print("登録：1\t\t閲覧：2\t\t更新：3\t\t削除：4");
			int select = Input.getInt();
			if(select == 1){
				//登録
				System.out.println("登録します");
				System.out.print("日付を入力：");
				int d = Input.getInt();
				op.getDate(d);
				System.out.print("時間(二桁)を入力：");
				int t = Input.getInt();
				op.getTime(t);
				System.out.print("科目を入力：");
				String w = Input.getString();
				op.getWhat(w);
				System.out.print("入金を入力：");
				int pm = Input.getInt();
				System.out.print("出金を入力：");
				int mm = Input.getInt();
				op.getResult(pm , mm);
				op.listUp();
				op.getTotal();
				System.out.println("日付：" + d + "\t\t時間：" + t + "\t\t科目：" + w + "\t\t入金：" + pm + "\t\t出金：" + mm);
				System.out.println("上記で登録しました");
				continue;
			}
			else if(select == 2){
				//閲覧
				try{
					System.out.println("閲覧します");
					System.out.println("日付\t時間\t科目\t入金\t出金\t残金\t");

					/*
					for (int i = 0; i < op.rootData.size(); i++){
						System.out.print(op.rootData.get(i).get("日付") + "日\t\t");
						System.out.print(op.rootData.get(i).get("時間") + "時\t\t");
						System.out.print(op.rootData.get(i).get("科目") + "\t\t");
						System.out.print(op.rootData.get(i).get("入金") + "円\t\t");
						System.out.print(op.rootData.get(i).get("出金") + "円\t\t");
						System.out.println(op.rootData.get(i).get("残金") + "円");

					}
					*/

					for(int i = 0; i < op.date.size() ; i++){
						System.out.print(op.list[0][i] + "日\t\t");
						System.out.print(op.list[1][i] + "時\t\t");
						System.out.print(op.list[2][i] + "\t\t");
						System.out.print(op.list[3][i] + "円\t\t");
						System.out.print(op.list[4][i] + "円\t\t");
						System.out.println(op.list[5][i] + "円");
					}
						System.out.println("入金合計：" + op.total[0] + "円");
						System.out.println("出金合計：" + op.total[1] + "円");
						System.out.println("残金合計：" + op.total[2] + "円");

					continue;
				}catch(Exception e){
					System.out.println("データがありません");
				}
			}else if(select == 3){
				//更新
				try{
					System.out.println("変更箇所を指定してください");
					System.out.print("日付：0\t\t時間：1\t\t科目：2\t\t入金：3\t\t出金：4\t\t");
					int f = Input.getInt();
					System.out.println("変更する行を指定してください");
					int s = Input.getInt();
					System.out.println("変更内容を入力してください");
					String u = Input.getString();
					op.update(f, s, u);
					op.listUp();
					System.out.println(f + "\tの" + s + "\t行目を" + u + "\tに変更しました");
					op.getTotal();
					continue;
				}catch(Exception e){
					System.out.println("データがありません");
				}
			}else if(select == 4){
				//削除
				System.out.println("削除します");
				System.out.println("実行：1");
				System.out.println("キャンセル：その他のキー");
				int d = Input.getInt();
				switch(d){
				case 1:
					op.delete();
					System.out.println("削除しました");
					break;
				default:
					break;
				}
				continue;
			}else{
				//例外処理
				System.out.println("コマンドエラー");
				continue;
			}
		}
	}
}
