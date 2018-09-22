public class Fragment_2 extends Fragment{
    private View view = null;
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_2, container, false);
        textView = view.findViewById(R.id.TV1);
        textView.setText(getArguments().getString("1"));
        return view;
    }
}
