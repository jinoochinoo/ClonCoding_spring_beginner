package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // DB 알아서 생성하면 GenerationType.IDENTITY
    private Long id; // 서버 저장용, primary key

    // @Column(name = "name") DB 저장된 이름하고 다를 때 별도로 표시하면 연결 가능
    private String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
