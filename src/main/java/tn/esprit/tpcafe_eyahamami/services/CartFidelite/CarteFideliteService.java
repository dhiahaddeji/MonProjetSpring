package tn.esprit.tpcafe_eyahamami.services.CartFidelite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_eyahamami.dto.CarteFidelite.CarteFideliteRequete;
import tn.esprit.tpcafe_eyahamami.dto.CarteFidelite.CarteFideliteResponse;
import tn.esprit.tpcafe_eyahamami.entities.CarteFidelite;
import tn.esprit.tpcafe_eyahamami.mapper.CarteFideliteMapper;
import tn.esprit.tpcafe_eyahamami.repositories.CarteFideliteRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class CarteFideliteService implements ICarteFideliteService {
    private CarteFideliteRepository carteFideliteRepository;
    private CarteFideliteMapper carteFideliteMapper;
    @Override
    public CarteFideliteResponse addCarteFidelite(CarteFideliteRequete carteFidelite) {
        CarteFidelite cart=carteFideliteMapper.toentity(carteFidelite);
        CarteFidelite cart1=carteFideliteRepository.save(cart);
        return carteFideliteMapper.todto(cart1);

    }

    @Override
    public List<CarteFideliteResponse> saveCarteFidelites(List<CarteFideliteRequete> carteFidelites) {
        List<CarteFidelite>carts=carteFideliteMapper.toentity2(carteFidelites);
        List<CarteFidelite>carts1=carteFideliteRepository.saveAll(carts);
        return carteFideliteMapper.todto2(carts1);

        }

    @Override
    public CarteFideliteResponse selectCarteFideliteById(long id) {
        CarteFidelite c=  carteFideliteRepository.findById(id).get();
        return carteFideliteMapper.todto(c);
    }

    @Override
    public List<CarteFideliteResponse> selectAllCarteFidelites() {

       List<CarteFidelite>C= carteFideliteRepository.findAll();
       return carteFideliteMapper.todto2(C);
    }

    @Override
    public void deleteCarteFidelite(CarteFideliteRequete carteFidelite) {
        CarteFidelite c = carteFideliteMapper.toentity(carteFidelite);
     carteFideliteRepository.delete(c);
    }

    @Override
    public void deleteAllCarteFidelites() {
        carteFideliteRepository.deleteAll();

    }

    @Override
    public void deleteCarteFideliteById(long id) {
        carteFideliteRepository.deleteById(id);

    }

    @Override
    public long countingCarteFidelites() {
        return  carteFideliteRepository.count();
    }

    @Override
    public boolean verifyCarteFideliteById(long id) {
        return  carteFideliteRepository.existsById(id);
    }
}
