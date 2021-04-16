# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RepositoryPolicyArgs', 'RepositoryPolicy']

@pulumi.input_type
class RepositoryPolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 repository: pulumi.Input[str]):
        """
        The set of arguments for constructing a RepositoryPolicy resource.
        :param pulumi.Input[str] policy: The policy document. This is a JSON formatted string.
        :param pulumi.Input[str] repository: Name of the repository to apply the policy.
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "repository", repository)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The policy document. This is a JSON formatted string.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        """
        Name of the repository to apply the policy.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)


@pulumi.input_type
class _RepositoryPolicyState:
    def __init__(__self__, *,
                 policy: Optional[pulumi.Input[str]] = None,
                 registry_id: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RepositoryPolicy resources.
        :param pulumi.Input[str] policy: The policy document. This is a JSON formatted string.
        :param pulumi.Input[str] registry_id: The registry ID where the repository was created.
        :param pulumi.Input[str] repository: Name of the repository to apply the policy.
        """
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if registry_id is not None:
            pulumi.set(__self__, "registry_id", registry_id)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy document. This is a JSON formatted string.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="registryId")
    def registry_id(self) -> Optional[pulumi.Input[str]]:
        """
        The registry ID where the repository was created.
        """
        return pulumi.get(self, "registry_id")

    @registry_id.setter
    def registry_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "registry_id", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the repository to apply the policy.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)


class RepositoryPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Elastic Container Registry Repository Policy.

        Note that currently only one policy may be applied to a repository.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        foo = aws.ecr.Repository("foo")
        foopolicy = aws.ecr.RepositoryPolicy("foopolicy",
            repository=foo.name,
            policy=\"\"\"{
            "Version": "2008-10-17",
            "Statement": [
                {
                    "Sid": "new policy",
                    "Effect": "Allow",
                    "Principal": "*",
                    "Action": [
                        "ecr:GetDownloadUrlForLayer",
                        "ecr:BatchGetImage",
                        "ecr:BatchCheckLayerAvailability",
                        "ecr:PutImage",
                        "ecr:InitiateLayerUpload",
                        "ecr:UploadLayerPart",
                        "ecr:CompleteLayerUpload",
                        "ecr:DescribeRepositories",
                        "ecr:GetRepositoryPolicy",
                        "ecr:ListImages",
                        "ecr:DeleteRepository",
                        "ecr:BatchDeleteImage",
                        "ecr:SetRepositoryPolicy",
                        "ecr:DeleteRepositoryPolicy"
                    ]
                }
            ]
        }
        \"\"\")
        ```

        ## Import

        ECR Repository Policy can be imported using the repository name, e.g.

        ```sh
         $ pulumi import aws:ecr/repositoryPolicy:RepositoryPolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The policy document. This is a JSON formatted string.
        :param pulumi.Input[str] repository: Name of the repository to apply the policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Elastic Container Registry Repository Policy.

        Note that currently only one policy may be applied to a repository.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        foo = aws.ecr.Repository("foo")
        foopolicy = aws.ecr.RepositoryPolicy("foopolicy",
            repository=foo.name,
            policy=\"\"\"{
            "Version": "2008-10-17",
            "Statement": [
                {
                    "Sid": "new policy",
                    "Effect": "Allow",
                    "Principal": "*",
                    "Action": [
                        "ecr:GetDownloadUrlForLayer",
                        "ecr:BatchGetImage",
                        "ecr:BatchCheckLayerAvailability",
                        "ecr:PutImage",
                        "ecr:InitiateLayerUpload",
                        "ecr:UploadLayerPart",
                        "ecr:CompleteLayerUpload",
                        "ecr:DescribeRepositories",
                        "ecr:GetRepositoryPolicy",
                        "ecr:ListImages",
                        "ecr:DeleteRepository",
                        "ecr:BatchDeleteImage",
                        "ecr:SetRepositoryPolicy",
                        "ecr:DeleteRepositoryPolicy"
                    ]
                }
            ]
        }
        \"\"\")
        ```

        ## Import

        ECR Repository Policy can be imported using the repository name, e.g.

        ```sh
         $ pulumi import aws:ecr/repositoryPolicy:RepositoryPolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param RepositoryPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepositoryPolicyArgs.__new__(RepositoryPolicyArgs)

            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
            __props__.__dict__["registry_id"] = None
        super(RepositoryPolicy, __self__).__init__(
            'aws:ecr/repositoryPolicy:RepositoryPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy: Optional[pulumi.Input[str]] = None,
            registry_id: Optional[pulumi.Input[str]] = None,
            repository: Optional[pulumi.Input[str]] = None) -> 'RepositoryPolicy':
        """
        Get an existing RepositoryPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The policy document. This is a JSON formatted string.
        :param pulumi.Input[str] registry_id: The registry ID where the repository was created.
        :param pulumi.Input[str] repository: Name of the repository to apply the policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryPolicyState.__new__(_RepositoryPolicyState)

        __props__.__dict__["policy"] = policy
        __props__.__dict__["registry_id"] = registry_id
        __props__.__dict__["repository"] = repository
        return RepositoryPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The policy document. This is a JSON formatted string.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="registryId")
    def registry_id(self) -> pulumi.Output[str]:
        """
        The registry ID where the repository was created.
        """
        return pulumi.get(self, "registry_id")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        """
        Name of the repository to apply the policy.
        """
        return pulumi.get(self, "repository")

