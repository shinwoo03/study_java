package move;

//변환 인터페이스
public interface Transformable extends Movable {
//절대위치로 이동
//상대위치로 이동
//크기를 변경
	void resize (int width, int height);
}
