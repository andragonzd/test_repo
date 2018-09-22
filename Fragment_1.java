# test_repo
bundle_fragment

public class Fragment_1 extends Fragment{
    EditText editText = null;
    Button button = null;
    MainActivity mainActivity = new MainActivity();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_1, container, false);
        editText = view.findViewById(R.id.EditText1);
        button = view.findViewById(R.id.button1);
        final Fragment_2 fragment_2 = new Fragment_2();
        final Bundle bundle = new Bundle();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("1", editText.getText().toString());
                fragment_2.setArguments(bundle);
                mainActivity.Move_Fragment(new Fragment_2());
                Toast.makeText(getActivity(), fragment_2.getArguments().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
