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
    'GetAccessEntryResult',
    'AwaitableGetAccessEntryResult',
    'get_access_entry',
    'get_access_entry_output',
]

@pulumi.output_type
class GetAccessEntryResult:
    """
    A collection of values returned by getAccessEntry.
    """
    def __init__(__self__, access_entry_arn=None, cluster_name=None, created_at=None, id=None, kubernetes_groups=None, modified_at=None, principal_arn=None, tags=None, tags_all=None, type=None, user_name=None):
        if access_entry_arn and not isinstance(access_entry_arn, str):
            raise TypeError("Expected argument 'access_entry_arn' to be a str")
        pulumi.set(__self__, "access_entry_arn", access_entry_arn)
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kubernetes_groups and not isinstance(kubernetes_groups, list):
            raise TypeError("Expected argument 'kubernetes_groups' to be a list")
        pulumi.set(__self__, "kubernetes_groups", kubernetes_groups)
        if modified_at and not isinstance(modified_at, str):
            raise TypeError("Expected argument 'modified_at' to be a str")
        pulumi.set(__self__, "modified_at", modified_at)
        if principal_arn and not isinstance(principal_arn, str):
            raise TypeError("Expected argument 'principal_arn' to be a str")
        pulumi.set(__self__, "principal_arn", principal_arn)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if tags_all and not isinstance(tags_all, dict):
            raise TypeError("Expected argument 'tags_all' to be a dict")
        pulumi.set(__self__, "tags_all", tags_all)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if user_name and not isinstance(user_name, str):
            raise TypeError("Expected argument 'user_name' to be a str")
        pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="accessEntryArn")
    def access_entry_arn(self) -> str:
        """
        Amazon Resource Name (ARN) of the Access Entry.
        """
        return pulumi.get(self, "access_entry_arn")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kubernetesGroups")
    def kubernetes_groups(self) -> Sequence[str]:
        """
        List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
        """
        return pulumi.get(self, "kubernetes_groups")

    @property
    @pulumi.getter(name="modifiedAt")
    def modified_at(self) -> str:
        """
        Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
        """
        return pulumi.get(self, "modified_at")

    @property
    @pulumi.getter(name="principalArn")
    def principal_arn(self) -> str:
        return pulumi.get(self, "principal_arn")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Mapping[str, str]:
        """
        (Optional) Key-value map of resource tags, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
        """
        return pulumi.get(self, "user_name")


class AwaitableGetAccessEntryResult(GetAccessEntryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessEntryResult(
            access_entry_arn=self.access_entry_arn,
            cluster_name=self.cluster_name,
            created_at=self.created_at,
            id=self.id,
            kubernetes_groups=self.kubernetes_groups,
            modified_at=self.modified_at,
            principal_arn=self.principal_arn,
            tags=self.tags,
            tags_all=self.tags_all,
            type=self.type,
            user_name=self.user_name)


def get_access_entry(cluster_name: Optional[str] = None,
                     principal_arn: Optional[str] = None,
                     tags: Optional[Mapping[str, str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessEntryResult:
    """
    Access Entry Configurations for an EKS Cluster.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.eks.get_access_entry(cluster_name=example_aws_eks_cluster["name"],
        principal_arn=example_aws_iam_role["arn"])
    pulumi.export("eksAccessEntryOutputs", example_aws_eks_access_entry)
    ```
    <!--End PulumiCodeChooser -->


    :param str cluster_name: Name of the EKS Cluster.
    :param str principal_arn: The IAM Principal ARN which requires Authentication access to the EKS cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['principalArn'] = principal_arn
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:eks/getAccessEntry:getAccessEntry', __args__, opts=opts, typ=GetAccessEntryResult).value

    return AwaitableGetAccessEntryResult(
        access_entry_arn=pulumi.get(__ret__, 'access_entry_arn'),
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        created_at=pulumi.get(__ret__, 'created_at'),
        id=pulumi.get(__ret__, 'id'),
        kubernetes_groups=pulumi.get(__ret__, 'kubernetes_groups'),
        modified_at=pulumi.get(__ret__, 'modified_at'),
        principal_arn=pulumi.get(__ret__, 'principal_arn'),
        tags=pulumi.get(__ret__, 'tags'),
        tags_all=pulumi.get(__ret__, 'tags_all'),
        type=pulumi.get(__ret__, 'type'),
        user_name=pulumi.get(__ret__, 'user_name'))


@_utilities.lift_output_func(get_access_entry)
def get_access_entry_output(cluster_name: Optional[pulumi.Input[str]] = None,
                            principal_arn: Optional[pulumi.Input[str]] = None,
                            tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessEntryResult]:
    """
    Access Entry Configurations for an EKS Cluster.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.eks.get_access_entry(cluster_name=example_aws_eks_cluster["name"],
        principal_arn=example_aws_iam_role["arn"])
    pulumi.export("eksAccessEntryOutputs", example_aws_eks_access_entry)
    ```
    <!--End PulumiCodeChooser -->


    :param str cluster_name: Name of the EKS Cluster.
    :param str principal_arn: The IAM Principal ARN which requires Authentication access to the EKS cluster.
    """
    ...
