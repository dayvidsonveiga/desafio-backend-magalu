package br.com.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
