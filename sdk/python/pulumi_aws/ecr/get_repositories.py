# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetRepositoriesResult',
    'AwaitableGetRepositoriesResult',
    'get_repositories',
    'get_repositories_output',
]

@pulumi.output_type
class GetRepositoriesResult:
    """
    A collection of values returned by getRepositories.
    """
    def __init__(__self__, id=None, names=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        AWS Region.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list if AWS Elastic Container Registries for the region.
        """
        return pulumi.get(self, "names")


class AwaitableGetRepositoriesResult(GetRepositoriesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoriesResult(
            id=self.id,
            names=self.names)


def get_repositories(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoriesResult:
    """
    Data source for providing information on AWS ECR (Elastic Container Registry) Repositories.

    ## Example Usage

    ### Basic Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ecr.get_repositories()
    ```
    <!--End PulumiCodeChooser -->
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ecr/getRepositories:getRepositories', __args__, opts=opts, typ=GetRepositoriesResult).value

    return AwaitableGetRepositoriesResult(
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'))


@_utilities.lift_output_func(get_repositories)
def get_repositories_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRepositoriesResult]:
    """
    Data source for providing information on AWS ECR (Elastic Container Registry) Repositories.

    ## Example Usage

    ### Basic Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ecr.get_repositories()
    ```
    <!--End PulumiCodeChooser -->
    """
    ...
