# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FargateProfileArgs', 'FargateProfile']

@pulumi.input_type
class FargateProfileArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 pod_execution_role_arn: pulumi.Input[str],
                 selectors: pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]],
                 fargate_profile_name: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a FargateProfile resource.
        :param pulumi.Input[str] cluster_name: Name of the EKS Cluster.
        :param pulumi.Input[str] pod_execution_role_arn: Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]] selectors: Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        :param pulumi.Input[str] fargate_profile_name: Name of the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "pod_execution_role_arn", pod_execution_role_arn)
        pulumi.set(__self__, "selectors", selectors)
        if fargate_profile_name is not None:
            pulumi.set(__self__, "fargate_profile_name", fargate_profile_name)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        Name of the EKS Cluster.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="podExecutionRoleArn")
    def pod_execution_role_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        """
        return pulumi.get(self, "pod_execution_role_arn")

    @pod_execution_role_arn.setter
    def pod_execution_role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "pod_execution_role_arn", value)

    @property
    @pulumi.getter
    def selectors(self) -> pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]]:
        """
        Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        """
        return pulumi.get(self, "selectors")

    @selectors.setter
    def selectors(self, value: pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]]):
        pulumi.set(self, "selectors", value)

    @property
    @pulumi.getter(name="fargateProfileName")
    def fargate_profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the EKS Fargate Profile.
        """
        return pulumi.get(self, "fargate_profile_name")

    @fargate_profile_name.setter
    def fargate_profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fargate_profile_name", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _FargateProfileState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 fargate_profile_name: Optional[pulumi.Input[str]] = None,
                 pod_execution_role_arn: Optional[pulumi.Input[str]] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering FargateProfile resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the EKS Fargate Profile.
        :param pulumi.Input[str] cluster_name: Name of the EKS Cluster.
        :param pulumi.Input[str] fargate_profile_name: Name of the EKS Fargate Profile.
        :param pulumi.Input[str] pod_execution_role_arn: Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]] selectors: Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        :param pulumi.Input[str] status: Status of the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if fargate_profile_name is not None:
            pulumi.set(__self__, "fargate_profile_name", fargate_profile_name)
        if pod_execution_role_arn is not None:
            pulumi.set(__self__, "pod_execution_role_arn", pod_execution_role_arn)
        if selectors is not None:
            pulumi.set(__self__, "selectors", selectors)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the EKS Fargate Profile.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the EKS Cluster.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="fargateProfileName")
    def fargate_profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the EKS Fargate Profile.
        """
        return pulumi.get(self, "fargate_profile_name")

    @fargate_profile_name.setter
    def fargate_profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fargate_profile_name", value)

    @property
    @pulumi.getter(name="podExecutionRoleArn")
    def pod_execution_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        """
        return pulumi.get(self, "pod_execution_role_arn")

    @pod_execution_role_arn.setter
    def pod_execution_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pod_execution_role_arn", value)

    @property
    @pulumi.getter
    def selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]]]:
        """
        Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        """
        return pulumi.get(self, "selectors")

    @selectors.setter
    def selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FargateProfileSelectorArgs']]]]):
        pulumi.set(self, "selectors", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the EKS Fargate Profile.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class FargateProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 fargate_profile_name: Optional[pulumi.Input[str]] = None,
                 pod_execution_role_arn: Optional[pulumi.Input[str]] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FargateProfileSelectorArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages an EKS Fargate Profile.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.eks.FargateProfile("example",
            cluster_name=aws_eks_cluster["example"]["name"],
            pod_execution_role_arn=aws_iam_role["example"]["arn"],
            subnet_ids=[__item["id"] for __item in aws_subnet["example"]],
            selectors=[aws.eks.FargateProfileSelectorArgs(
                namespace="example",
            )])
        ```
        ### Example IAM Role for EKS Fargate Profile

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.iam.Role("example", assume_role_policy=json.dumps({
            "Statement": [{
                "Action": "sts:AssumeRole",
                "Effect": "Allow",
                "Principal": {
                    "Service": "eks-fargate-pods.amazonaws.com",
                },
            }],
            "Version": "2012-10-17",
        }))
        example__amazon_eks_fargate_pod_execution_role_policy = aws.iam.RolePolicyAttachment("example-AmazonEKSFargatePodExecutionRolePolicy",
            policy_arn="arn:aws:iam::aws:policy/AmazonEKSFargatePodExecutionRolePolicy",
            role=example.name)
        ```

        ## Import

        EKS Fargate Profiles can be imported using the `cluster_name` and `fargate_profile_name` separated by a colon (`:`), e.g.

        ```sh
         $ pulumi import aws:eks/fargateProfile:FargateProfile my_fargate_profile my_cluster:my_fargate_profile
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: Name of the EKS Cluster.
        :param pulumi.Input[str] fargate_profile_name: Name of the EKS Fargate Profile.
        :param pulumi.Input[str] pod_execution_role_arn: Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FargateProfileSelectorArgs']]]] selectors: Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FargateProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EKS Fargate Profile.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.eks.FargateProfile("example",
            cluster_name=aws_eks_cluster["example"]["name"],
            pod_execution_role_arn=aws_iam_role["example"]["arn"],
            subnet_ids=[__item["id"] for __item in aws_subnet["example"]],
            selectors=[aws.eks.FargateProfileSelectorArgs(
                namespace="example",
            )])
        ```
        ### Example IAM Role for EKS Fargate Profile

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.iam.Role("example", assume_role_policy=json.dumps({
            "Statement": [{
                "Action": "sts:AssumeRole",
                "Effect": "Allow",
                "Principal": {
                    "Service": "eks-fargate-pods.amazonaws.com",
                },
            }],
            "Version": "2012-10-17",
        }))
        example__amazon_eks_fargate_pod_execution_role_policy = aws.iam.RolePolicyAttachment("example-AmazonEKSFargatePodExecutionRolePolicy",
            policy_arn="arn:aws:iam::aws:policy/AmazonEKSFargatePodExecutionRolePolicy",
            role=example.name)
        ```

        ## Import

        EKS Fargate Profiles can be imported using the `cluster_name` and `fargate_profile_name` separated by a colon (`:`), e.g.

        ```sh
         $ pulumi import aws:eks/fargateProfile:FargateProfile my_fargate_profile my_cluster:my_fargate_profile
        ```

        :param str resource_name: The name of the resource.
        :param FargateProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FargateProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 fargate_profile_name: Optional[pulumi.Input[str]] = None,
                 pod_execution_role_arn: Optional[pulumi.Input[str]] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FargateProfileSelectorArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
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
            __props__ = FargateProfileArgs.__new__(FargateProfileArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            __props__.__dict__["fargate_profile_name"] = fargate_profile_name
            if pod_execution_role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'pod_execution_role_arn'")
            __props__.__dict__["pod_execution_role_arn"] = pod_execution_role_arn
            if selectors is None and not opts.urn:
                raise TypeError("Missing required property 'selectors'")
            __props__.__dict__["selectors"] = selectors
            __props__.__dict__["subnet_ids"] = subnet_ids
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["status"] = None
        super(FargateProfile, __self__).__init__(
            'aws:eks/fargateProfile:FargateProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            fargate_profile_name: Optional[pulumi.Input[str]] = None,
            pod_execution_role_arn: Optional[pulumi.Input[str]] = None,
            selectors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FargateProfileSelectorArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'FargateProfile':
        """
        Get an existing FargateProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the EKS Fargate Profile.
        :param pulumi.Input[str] cluster_name: Name of the EKS Cluster.
        :param pulumi.Input[str] fargate_profile_name: Name of the EKS Fargate Profile.
        :param pulumi.Input[str] pod_execution_role_arn: Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FargateProfileSelectorArgs']]]] selectors: Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        :param pulumi.Input[str] status: Status of the EKS Fargate Profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FargateProfileState.__new__(_FargateProfileState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["fargate_profile_name"] = fargate_profile_name
        __props__.__dict__["pod_execution_role_arn"] = pod_execution_role_arn
        __props__.__dict__["selectors"] = selectors
        __props__.__dict__["status"] = status
        __props__.__dict__["subnet_ids"] = subnet_ids
        __props__.__dict__["tags"] = tags
        return FargateProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the EKS Fargate Profile.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        Name of the EKS Cluster.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="fargateProfileName")
    def fargate_profile_name(self) -> pulumi.Output[str]:
        """
        Name of the EKS Fargate Profile.
        """
        return pulumi.get(self, "fargate_profile_name")

    @property
    @pulumi.getter(name="podExecutionRoleArn")
    def pod_execution_role_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        """
        return pulumi.get(self, "pod_execution_role_arn")

    @property
    @pulumi.getter
    def selectors(self) -> pulumi.Output[Sequence['outputs.FargateProfileSelector']]:
        """
        Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        """
        return pulumi.get(self, "selectors")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the EKS Fargate Profile.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags.
        """
        return pulumi.get(self, "tags")

