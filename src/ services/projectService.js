@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repository;

    public List<Project> getAllProjects() {
        return repository.findAll();
    }
}