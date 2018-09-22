public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Move_Fragment(new Fragment_1());
                fab.setVisibility(View.GONE);
            }
        });
    }
    public void Move_Fragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.Frame_Layout, fragment);
        if(!isFinishing()){
            fragmentTransaction.commit();
        }

    }
}
