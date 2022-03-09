package tn.globebusiness.spring.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
@Table(name = "company")
public class Company implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	

	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
 
    private String name;

    private String address;
    @Column(name ="email" , unique = true)
    private String email;

    private Long phone;

    private String image;
   
    @Column(name ="login" , unique = true)
    
    private String login;
    
    private String pwd; 
    
    @Enumerated(EnumType.STRING)
    private Role role;
    
    
    


	


	@OneToMany(cascade = CascadeType.ALL, mappedBy="company")
    private Set<Invitation> invitations;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="company")
    private Set<Employee> employees;

	

    
}