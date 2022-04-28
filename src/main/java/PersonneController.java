

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetspring.projetSB.Entity.Personne;

import com.projetspring.projetSB.Service.Personne.PersonneService;

@CrossOrigin("*")
@RestController
//@ComponentScan(basePackageClasses = com.projetspring.projetSB.Service.Personne.PersonneService.class)
@RequestMapping("api/")
public class PersonneController {

	@Autowired
	private PersonneService personneService;
	
	@PostMapping("addPersonne")  
	 public Personne addPersonne(@RequestBody Personne e)
	 {
		 return ((PersonneService) personneService).addPersonne(e);
	 }
	 
	
	@GetMapping("personnes")
	 public List<Personne> getAllPersonnes()
	 {
		//System.out.print("hello");
		 return personneService.getAllPersonnes();
	 }
	
//	@GetMapping("/employees/{id}") 
//	 public Employee getEmployeeById(@PathVariable Long id)
//	 {
//		 return employeeService.getEmployee(id);
//	 } 
	 
//	@GetMapping("/personneByName/{name}")
//	 public Optional<Personne> getEmployeeByName(@PathVariable String name)
//	 {
//		 return ((PersonneController) personneService).getEmployeeByName(name);
//	 }
	
	@PutMapping("/updatePersonne")
	 public Personne updatePersonne(@RequestBody Personne p)
	 {
		 return ((PersonneController) personneService).updatePersonne(p);
	 }
	
	@DeleteMapping("/delete/{id}")
	public String deletePersonne(@PathVariable long id)
	{
		return ((PersonneController) personneService).deletePersonne(id);
	}
}
