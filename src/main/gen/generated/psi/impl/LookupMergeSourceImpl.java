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

public class LookupMergeSourceImpl extends ASTWrapperPsiElement implements LookupMergeSource {

  public LookupMergeSourceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitLookupMergeSource(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MergeSourceExpr getMergeSourceExpr() {
    return findChildByClass(MergeSourceExpr.class);
  }

  @Override
  @Nullable
  public MergeSourceKeyspace getMergeSourceKeyspace() {
    return findChildByClass(MergeSourceKeyspace.class);
  }

  @Override
  @Nullable
  public MergeSourceSubquery getMergeSourceSubquery() {
    return findChildByClass(MergeSourceSubquery.class);
  }

  @Override
  @Nullable
  public UseClause getUseClause() {
    return findChildByClass(UseClause.class);
  }

}
