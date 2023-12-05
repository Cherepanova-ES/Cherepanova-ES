package course2.ui.popup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CustomPopupMenu extends JPopupMenu {

    private final JList<?> jList;

    public CustomPopupMenu(JList<?> jList) {
        this.jList = jList;
    }

    // переопределяем метод для выделения строки при правом клике
    @Override
    public void show(Component invoker, int x, int y) {
        int row = jList.locationToIndex(new Point(x, y));

        if (row != -1) {
            jList.setSelectedIndex(row);
        }

        super.show(invoker, x, y);
    }

    // всплывающее меню для компонента JList с двумя кнопками: Редактировать/Удалить
    public static JPopupMenu create(JList<?> jList,
                                              ActionListener editListener,
                                              ActionListener deleteListener) {
        var edit = new JMenuItem("Редактировать");
        var delete = new JMenuItem("Удалить");

        edit.addActionListener(editListener);
        delete.addActionListener(deleteListener);

        var pm = new CustomPopupMenu(jList);
        pm.add(edit);
        pm.add(delete);
        return pm;
    }
}
