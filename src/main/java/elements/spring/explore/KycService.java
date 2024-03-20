package elements.spring.explore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KycService {
    @Autowired
    private KycRepository repository;

    public List<KnowYourCustomer> implementOnDate(String date){
        return repository.fetchAllEarlierDate(date);
    }

    public List<String> implementDeletionMultiple(String location){
        List<String> holders=repository.findAllByLocation(location);
        repository.deleteAllByLocation(location);
        return holders;
    }

    public void implementUpdate(){
        repository.updateOnBalance();
    }

    public List<Long> implementFetchAadhaar(){
        return repository.findAllAadhaar();
    }

    public List<KnowYourCustomer> implementMinimumBalance(double balance){
        return repository.findAllByMinimumBalance(balance);
    }

    public List<KnowYourCustomer> implementOfExactBalance(double balance){
        return repository.findAllByAccountBalance(balance);
    }

    public Optional<KnowYourCustomer> implementOfPan(String pan){
        return repository.findByPan(pan);
    }

    public String implementOfDeleteById(long accountNumber){
        KnowYourCustomer knowYourCustomer=repository.findById(accountNumber).get();
        String information= knowYourCustomer.getAccountHolder()+" has removed/suspended";
        repository.deleteById(accountNumber);
        return information;
    }

    public Optional<KnowYourCustomer> implementOfFindById(long accountNumber){
        return repository.findById(accountNumber);
    }

    public List<KnowYourCustomer> implementOfFindAll(){
        return (List<KnowYourCustomer>) repository.findAll();
    }

    public KnowYourCustomer implementationOfSave(KnowYourCustomer knowYourCustomer){
        return repository.save(knowYourCustomer);
    }
}