// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class IndexNestClauseImpl extends ASTWrapperPsiElement implements IndexNestClause {

  public IndexNestClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitIndexNestClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IndexNestPredicate getIndexNestPredicate() {
    return findNotNullChildByClass(IndexNestPredicate.class);
  }

  @Override
  @NotNull
  public IndexNestRhs getIndexNestRhs() {
    return findNotNullChildByClass(IndexNestRhs.class);
  }

  @Override
  @Nullable
  public IndexNestType getIndexNestType() {
    return findChildByClass(IndexNestType.class);
  }

}
