package com.example.bugunneyesem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] corbaisimleri={"mercimek corbasi","domates corbasi","tavuk corbasi",
            "arpa sehriye corbasi",
            "ascibasi corbasi","kis corbasi","ezogelin corbasi","etli corba","kiyma pacasi",
            "yogurt corbasi","kasik corbasi","anadolu corbasi","tarhana corbasi",
            "yogurtlu kofteli corba"};
    int[] corbaresimleri={R.drawable.mercimek,R.drawable.domates,R.drawable.tavuk};
    String[] malzemeler={"2 su bardağı kırmızı mercimek\n" +
            "1 adet soğan\n" +
            "2 yemek kaşığı un\n" +
            "1 adet havuç\n" +
            "Yarım yemek kaşığı biber ya da  domates salçası (rengi kırmızı olsun isterseniz artırabilir ya da hiç kullanmayabilirsiniz)\n" +
            "1 tatlı kaşığı tuz\n" +
            "Yarım çay kaşığı karabiber\n" +
            "1 çay kaşığı kimyon (isteğe bağlı)\n" +
            "2 litre sıcak su\n" +
            "5 yemek kaşığı sıvı yağ",
            "4-5 adet olgun domates\n" +
                    "2 çorba kaşığı tereyağı\n" +
                    "3 çorba kaşığı un\n" +
                    "1 litre sıcak su\n" +
                    "1 su bardağı süt\n" +
                    "1 çorba kaşığı rendelenmiş taze kaşar","3\n" +
            "adet\n" +
            "tavuk but\n" +
            "6\n" +
            "su bardağı\n" +
            "sıcak su\n" +
            "2\n" +
            "yemek kaşığı\n" +
            "tereyağı\n" +
            "2\n" +
            "yemek kaşığı\n" +
            "un\n" +
            "1\n" +
            "adet\n" +
            "havuç\n" +
            "1\n" +
            "tatlı kaşığı\n" +
            "tuz\n" +
            "1/2\n" +
            "tatlı kaşığı\n" +
            "karabiber"
    };
    String[] aciklamalar={"Kırmızı mercimek çorbası için sıvı yağı tencereye alınarak yemeklik doğranan soğanlar hafif pembeleşinceye kadar kavrulur.\n" +
            "Daha sonra un ilave edilerek kısık ateşte kavurmaya devam edilir.\n" +
            "Salça kullanılacak ise salça ilave edilir, kavrulduktan sonra küp küp doğranmış havuç ve iyice yıkanıp suyu süzülen mercimekler ilave edilir.\n" +
            "Üzerine su eklenerek karıştırılır ve tencerenin kapağı kapatılır. Çorbamız kaynayana kadar orta ateşte, kaynadıktan sonra mercimekler ve havuçlar yumuşayana kadar ara ara karıştırılarak kısık ateşte pişirilir.\n" +
            "Çorba piştikten sonra el blenderı ile güzelce ezilir. Eğer blenderiniz yoksa süzgeçten de geçirebilirsiniz.\n" +
            "Karabiber, tuz ve isteğe bağlı olarak kimyon eklenir ve karıştırılır. 5 dakika daha pişirelerek ocaktan alınır.\n" +
            "Kıvamı koyu gelirse size, bir miktar su ilave edilerek bir taşım kaynatılır.\n" +
            "Bu arada küçük bir tavaya iki yemek kaşığı tereyağı alınır, kızdırılır ve bir tatlı kaşığı kırmızı toz biber eklenerek ocaktan alınır.\n" +
            "Mercimek çorbası servis kasesine alındıktan sonra üzerine kırmızı biberli sos gezdirilir ve bir dilim limon ile servis edilir.",
            "Domates çorbası yapmak için yağ ve un bir tencerede hafifçe kavrulur.\n" +
                    "Diğer taraftan kabuğu çıkarılıp, küp küp kesilmiş domates robottan geçirilip bu karışıma ilave edilir, birkaç dakika kavrulur.\n" +
                    "Ara verilmeden bir litre kadar su ilave edilip karıştırma işlemini sürdürülür. 15 dakika bu şekilde kaynatılır.\n" +
                    "Daha sonra süt ilave edilip birkaç dakika daha kaynatılarak tuzu ilave edilip ocaktan alınır.\n" +
                    "Arzuya göre servis yaparken üzerine kaşar peyniri rendesi ilave edilir. Domates çorbamız servise hazır, afiyet olsun.",
            "Derin bir tencereye tavuk butları ve isteğe göre lezzet vermesi için birer tane havuç ve patatesi parçalar halinde ekleyin. Üzerine sıcak suyu ilave edin ve tavukların pişmesi ve tavuk suyunun hazır olması için yaklaşık 20 dakika pişirin. Tavuk suyundan sebzeleri bir çatal yardımıyla çıkarın.\n" +
                    "tavuk-corbasi-asama-1\n" +
                    "Haşlanan tavukları ufak ufak didikleyin. Ardından havuç ve patatesleri blender ile püre haline getirip tavuklarla birleştirin.\n" +
                    "tavuk-corbasi-asama-2\n" +
                    "Ayrı bir tencerede yağı eritip ve üzerine unu ekliyoruz. Unun kokusu çıkana kadar karartmadan kavurun.\n" +
                    "tavuk-corbasi-asama-3\n" +
                    "Üzerine rendelenmiş havucu ekleyin, 3 dakika kadar kavurun.\n" +
                    "tavuk-corbasi-asama-4\n" +
                    "Haşlanan ve didiklenen tavuklar ile tavuk suyunu ekleyin. Son olarak tuz ve karabiberi ekleyin.\n" +
                    "tavuk-corbasi-asama-5\n" +
                    "Tencerenin kapağını kapatıp çorbayı yaklaşık 10 dakika kadar kaynamaya bırakın.\n" +
                    "tavuk-corbasi-asama-6\n" +
                    "Çorba kıvam alınca hazır olacak.\n" +
                    "tavuk-corbasi-asama-7\n" +
                    "Arzuya göre üzerine pul biber serperek ve limon suyu ekleyerek servis edin. Afiyet olsun."};

static  public Bitmap corbaresmi;

String isim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);


        adapter=new ArrayAdapter<>(this, android.R.layout.simple_selectable_list_item,corbaisimleri);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("corba ismi",corbaisimleri[position]);
                intent.putExtra("malzemeler",malzemeler[position]);
                intent.putExtra("aciklamalar",aciklamalar[position]);
                corbaresmi= BitmapFactory.decodeResource(getApplicationContext().getResources(),corbaresimleri[position]);
                startActivity(intent);
            }
        });
    }
}